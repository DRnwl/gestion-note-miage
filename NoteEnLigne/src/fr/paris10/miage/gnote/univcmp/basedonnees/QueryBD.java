package fr.paris10.miage.gnote.univcmp.basedonnees;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import fr.paris10.miage.gnote.univcmp.bean.Formation;
import fr.paris10.miage.gnote.univcmp.bean.Promotion;
import fr.paris10.miage.gnote.univcmp.bean.PromotionEtudiant;
import fr.paris10.miage.gnote.usercmp.bean.Contrat_Quadrienal;
import fr.paris10.miage.gnote.usercmp.bean.Etudiant;

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
			in = new FileInputStream(path +"/WEB-INF/Base.properties");
		} catch (Exception e) {
			System.out.println("Probleme lors de l'ouverture du fichier Base.properties" + e.toString());
			
		}
		try {
			prop.load(in);
			driver= prop.getProperty("BdDriver");
			url = prop.getProperty("BdUrl");
			login = prop.getProperty("BDlogin");
			pwd = prop.getProperty("BDpwd");
			in.close();
		} catch (IOException e) {
			System.out.println("Erreur lors de la rï¿½cupï¿½ration des donnï¿½es contenues dans le fichier properties :" + e.toString());
		}
		try {
			Class.forName(driver);//driver
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
			System.exit(1);
		}
		try {
			cx = DriverManager.getConnection(url,login,pwd);// url login pwd

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

	/**** requete vers la base de donnÃ©es ***/ 
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
	public ResultSet recupIdentite ( String type,String login, String pwd) throws SQLException{
		String requete ;
		ResultSet rs;
		if(type=="etudiant"){
			requete ="SELECT * FROM CANDIDAT inner join ETUDIANT on CANDIDAT.NCANDIDAT=ETUDIANT.NCANDIDAT WHERE CANDIDAT.LOG_IN = '" + login + "' AND CANDIDAT.MOT_DE_PASSE = '" + pwd + "'";

		}else{
			if(type=="scretatriat"){
				requete = "SELECT * FROM type_poste INNER JOIN enseignant ON " 
						+ "type_poste.nposte = enseignant.nposte WHERE " 
						+ "type_poste.type_poste = 'secretaire' AND " 
						+ "enseignant.login = '"+login+"' AND enseignant.pwd = '"+pwd+"'";

			}else{
				requete = "SELECT * FROM ENSEIGNANT WHERE LOGIN = '" + login + "' AND PWD = '" + pwd + "'";

			}

		} 

		Statement st = cx.createStatement();
		rs = st.executeQuery(requete);
		return rs;


	}
	
	private void affectPromotionEtudiant(Etudiant st) throws SQLException{
        try {
            PreparedStatement pst = cx.prepareStatement("SELECT * FROM EST_DANS inner join (PROMOTION inner join (FORMATION inner join CONTRAT_QUADRIENNAL on FORMATION.NCONTRAT=CONTRAT_QUADRIENNAL.NCONTRAT) on PROMOTION.NFORMATION=FORMATION.NFORMATION) on EST_DANS.NPROMOTION=PROMOTION.NPROMOTION WHERE netudiant=?");
            pst.setInt(1, st.getNumeroEtudiant());
            if (pst.execute()) {
                ResultSet rs = pst.getResultSet();
                Contrat_Quadrienal contrat= new Contrat_Quadrienal();
                Formation formation=new Formation();
                Promotion promotion=new Promotion();
                PromotionEtudiant promotionEtudiant= new PromotionEtudiant();
                while (rs.next()) {
                    contrat.setNumeroContrat(rs.getInt("NCONTRAT"));
                    contrat.setDateContrat(rs.getDate("DATE_CONTRAT"));
                    contrat.setDuree(rs.getFloat("DUREE"));
                    formation.setContrat(contrat);
                    formation.setNumeroFormation(rs.getInt("NFORMATION"));
                    formation.setLibelle(rs.getString("LIBELLE"));
                    formation.setNiveau(rs.getString("NIVEAU"));
                    formation.setType(rs.getString("TYPE_FORMATION"));
                    formation.setParcours(rs.getString("PARCOURS"));
                    promotion.setFormation(formation);
                    promotion.setNumeroPromotion(rs.getInt("NPROMOTION"));
                    promotionEtudiant.setEtudiant(st);
                    promotionEtudiant.setPromotion(promotion);
                    st.addPromotionEtudiant(promotionEtudiant);
                }
                rs.close();
            }
            pst.close();
        } catch (SQLException e) {
            e.getMessage();
        }
    }


}

