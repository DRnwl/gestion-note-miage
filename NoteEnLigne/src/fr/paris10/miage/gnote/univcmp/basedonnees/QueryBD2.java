package fr.paris10.miage.gnote.univcmp.basedonnees;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import fr.paris10.miage.gnote.univcmp.bean.Examen;
import fr.paris10.miage.gnote.univcmp.bean.Promotion;
import fr.paris10.miage.gnote.univcmp.bean.PromotionEtudiant;
import fr.paris10.miage.gnote.univcmp.bean.ResultatExamen;
import fr.paris10.miage.gnote.usercmp.bean.Candidat;
import fr.paris10.miage.gnote.usercmp.bean.Enseignant;
import fr.paris10.miage.gnote.usercmp.bean.Etudiant;

public class QueryBD2 {
	private ArrayList<Enseignant> enseignants ; // liste de enseignant
    private ArrayList<Etudiant> etudiants ; // liste des etudiants
    private ArrayList<Examen> examens ; // liste des examens
    private ArrayList<Candidat> candidats; //liste des candidats
    private ArrayList<Promotion> promotions; //liste des promotions
	private Connection cx;
	private Statement st;
	private ResultSet rs;

	public QueryBD2(String path) {
		Properties prop = new Properties();
		FileInputStream in = null;
		
		try {
			in = new FileInputStream(path +"/WEB-INF/Base.properties");
			prop.load(in);
		} catch (FileNotFoundException e) {
            Logger.getLogger("").log(Level.OFF, e + "Erreur lors de la connexion à la base de données");
        }
        catch(IOException ex){
            Logger.getLogger("").log(Level.OFF, ex + "Erreur lors de la connexion à la base de données");
        }
		
		String driver= prop.getProperty("BdDriver");
		String url = prop.getProperty("BdUrl");
		String login = prop.getProperty("BDlogin");
		String pwd = prop.getProperty("BDpwd");
		
		try {
			Class.forName(driver);//driver
			cx = DriverManager.getConnection(url,login,pwd);// url login pwd
			// ENSEIGNANTS
			try {
	            rs = st.executeQuery("Select * From ENSEIGNANT");
	            try {
	                while (rs.next()) {
	                    Enseignant enseignant = new Enseignant();
	                    enseignant.setNumeroEnseignant(rs.getInt("NENSEIGNANT"));
	                    enseignant.setNumeroPoste(rs.getInt("NPOSTE"));
	                    enseignant.setNom(rs.getString("NOM"));
	                    enseignant.setPrenom(rs.getString("PRENOM"));
	                    enseignant.setAdresse(rs.getString("ADRESSE"));
	                    enseignant.setTelephone(rs.getString("TELEPHONE"));
	                    enseignant.setDateNaissance(rs.getString("DATENAISSANCE"));
	                    enseignant.setLogin(rs.getString("LOGIN"));
	                    enseignant.setPwd(rs.getString("PWD"));
	                    
	                    enseignants.add(enseignant);
	                }
		            } catch (SQLException e) {
		                System.out.println("Chargement des enseignants impossible "+e.toString());
		            }
		        } catch (SQLException e) {
		        	System.out.println("Probleme avec la requete " + e.toString());
		        }
			// LES ETUDIANTS
			try {
	            rs = st.executeQuery("Select * From ETUDIANT inner joint CANDIDAT");
	            try {
	                while (rs.next()) {
	                    Etudiant etudiant = new Etudiant();
	                    etudiant.setNumeroEtudiant(rs.getInt("NETUDIANT"));
	                    etudiant.setModeEvaluation(rs.getString("MODEEVALUATION"));
	                    //A COMPLETER AVEC LES ATTRIBUTS DU CANDIDAT
	                    etudiants.add(etudiant);
	                }
		            } catch (SQLException e) {
		                System.out.println("Chargement des enseignants impossible "+e.toString());
		            }
		        } catch (SQLException e) {
		        	System.out.println("Probleme avec la requete " + e.toString());
		        }
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
			System.exit(1);
		}
		
		// Affectation - Etape5
        //for (Enseignant enseignant : enseignants) { this.affect??(cx, enseignant); }  
        //affectation des modules à l'enseignant --> possible necessité d'ajouter une list de module dans la table enseignant                     
        for (Etudiant etudiant : etudiants) { this.affectResultatExamen(etudiant); }
        for (Etudiant etudiant : etudiants) { this.affectPromotion(etudiant); }
	}

    /**
     * Affectation des résultats des examents à l'étudiant
     * @param etudiant 
     */
    private void affectResultatExamen(Etudiant etudiant){
        try {
            PreparedStatement pst = cx.prepareStatement("SELECT * FROM A_PASSE WHERE netudiant=?");
            pst.setInt(1, etudiant.getNumeroEtudiant());
            if (pst.execute()) {
                ResultSet rs = pst.getResultSet();
                while (rs.next()) {
                	ResultatExamen re = new ResultatExamen();
                    re.setEtudiant(etudiant);
                    re.setNote(rs.getDouble("note"));
                    for (Examen e : examens) {
                        if (e.getNumeroExamen()== rs.getInt("idModule")) {
                            re.setExamen(e);
                            break;
                        }
                    }
                    etudiant.addResultatExamen(re);
                }
                rs.close();
            }
            pst.close();
        } catch (SQLException e) {
            System.out.println("PreparedStatement probleme " + e.toString());
        }
    }
    
    /**
     * Affectation les promotions à l'étudiant
     * @param etudiant 
     */
    private void affectPromotion(Etudiant etudiant){
        try {
            PreparedStatement pst = cx.prepareStatement("SELECT * FROM EST_DANS WHERE netudiant=?");
            pst.setInt(1, etudiant.getNumeroEtudiant());
            if (pst.execute()) {
                ResultSet rs = pst.getResultSet();
                while (rs.next()) {
                	PromotionEtudiant pe = new PromotionEtudiant();
                    pe.setEtudiant(etudiant);
                    for (Promotion p : promotions) {
                        if (p.getNumeroPromotion()== rs.getInt("NPROMOTION")) {
                            pe.setPromotion(p);
                            break;
                        }
                    }
                    etudiant.addPromotionEtudiant(pe);
                }
                rs.close();
            }
            pst.close();
        } catch (SQLException e) {
        	System.out.println("PreparedStatement probleme " + e.toString());
        }
    }
	
    /**
     * Check if the user exists
     * @param login : user's login
     * @param password : user's password
     * @param type : techer or etudiant
     *  
     */
    public void checkUser (String login, String password, String type){
        int c = 0;
        if (login.equals("") || login == null || password.equals("") || password == null ) {
           System.out.println("Valeur de login ou password incorrect");
        } else {
            if (type.equals("Etudiant")) {
                for (int i = 0; i < etudiants.size(); i++) {
                    if (etudiants.get(i).getLogin().equals(login)) {
                        c++;
                        if (!etudiants.get(i).getPassword().equals(password)) {
                            System.out.println(login + " mot de passe incorrect");
                        }
                    }
                }
                if (c == 0) { System.out.println(login + " n'existe pas"); }
            } else {
                for (int i = 0; i < enseignants.size(); i++) {
                    if (enseignants.get(i).getLogin().equals(login)) {
                        c++;
                        if (!enseignants.get(i).getPwd().equals(password)) {
                        	System.out.println(login + " mot de passe incorrect");
                        }
                    }
                }
                if (c == 0) { System.out.println(login + " n'existe pas"); }
            }
        }
    }
    
	public void closeCo() {
		try {
			rs.close();
			cx.close();
		} catch (SQLException ex) {
			System.out.println("Probleme deconnexion" + ex.toString());
		}
	}





}

