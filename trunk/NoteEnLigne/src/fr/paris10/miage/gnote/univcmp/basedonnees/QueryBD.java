package fr.paris10.miage.gnote.univcmp.basedonnees;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class QueryBD {

	private Connection cx;
	private String driver;
	private String url;
	private String login;
	private String pwd;

	public QueryBD(String path) {
		Properties prop = new Properties();
		FileInputStream in = null;
		try {
			in = new FileInputStream(path + "/WEB-INF/Base.properties");
		} catch (Exception e) {
			System.out.println("Probleme lors de l'ouverture du fichier Base.properties" + e.toString());
		}
		try {
			prop.load(in);
			driver= prop.getProperty("BdDrive");
			url = prop.getProperty("BdUrl");
			login = prop.getProperty("BDlogin");
			pwd = prop.getProperty("BDpwd");
			in.close();
		} catch (IOException e) {
			System.out.println("Erreur lors de la r�cup�ration des donn�es contenues dans le fichier properties :" + e.toString());
		}
		try {
			Class.forName(driver);
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
			System.exit(1);
		}
		try {
			cx = DriverManager.getConnection(url, login, pwd);

		} catch (SQLException ex) {
			System.out.println("Erreur de connexion : " + ex.toString());
		}
	}

	public void closeCo() {
		try {
			cx.close();
		} catch (SQLException ex) {
			System.out.println("Probleme deconnexion" + ex.toString());
		}
	}

	/**** requete vers la base de données ***/ 
	public boolean executerRequete(String requete) {
		try {
			Statement st = cx.createStatement();

			ResultSet rs = st.executeQuery(requete);
			if (rs.next()) {
				rs.close();
				st.close();
				return true;
			}
			rs.close();
			st.close();
			return false;
		} catch (SQLException ex) {
			System.out.println("Erreur d'execution :" + ex.toString());
		}
		return false;
	}


	public String comparerIdentifiant(String login, String pwd) throws SQLException {
		String requete = "SELECT * FROM CANDIDAT WHERE LOG_IN = '" + login + "' AND MOT_DE_PASSE = '" + pwd + "'";
		if(executerRequete(requete)){
			return "etudiant";
		}else{
			requete = "SELECT * FROM type_poste INNER JOIN enseignant ON " 
					+ "type_poste.nposte = enseignant.nposte WHERE " 
					+ "type_poste.type_poste = 'secretaire' AND " 
					+ "enseignant.login = '"+login+"' AND enseignant.pwd = '"+pwd+"'";
			if(executerRequete(requete)){
				return "secretariat";
			}else{

				requete = "SELECT * FROM ENSEIGNANT WHERE LOGIN = '" + login + "' AND PWD = '" + pwd + "'";
				if(executerRequete(requete)){
					return "enseignant";
				}

			}   
		}

		return "identifiant non valide";

	}


}

