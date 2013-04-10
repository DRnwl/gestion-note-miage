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

import fr.paris10.miage.gnote.univcmp.bean.EC;
import fr.paris10.miage.gnote.univcmp.bean.Examen;
import fr.paris10.miage.gnote.univcmp.bean.Formation;
import fr.paris10.miage.gnote.univcmp.bean.Promotion;
import fr.paris10.miage.gnote.univcmp.bean.PromotionEtudiant;
import fr.paris10.miage.gnote.univcmp.bean.ResultatExamen;
import fr.paris10.miage.gnote.univcmp.bean.Semestre;
import fr.paris10.miage.gnote.univcmp.bean.TypeT;
import fr.paris10.miage.gnote.univcmp.bean.UE;
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

	
	
	public void affectResultatExamenFormation(Etudiant st, int numeroFormation) throws SQLException{
		System.out.println("je suis dans la fonction affectResultatExamenFormation de l'étudiant n°"
							+st.getNumeroEtudiant()+ " et le numero de formation: "+numeroFormation);
        try {
            PreparedStatement pst = cx.prepareStatement("SELECT distinct a_passe.netudiant, a_passe.nexamen, " +
            		"a_passe.note, examen.date_examen, examen.ntype, examen.nformation, examen.nue, " +
            		"examen.nec, examen.horaire, examen.libelle as libelle_examen, examen.pourcentage, " +
            		"formation.ncontrat, formation.libelle as libelle_formation, formation.niveau, " +
            		"formation.type_formation, formation.parcours, contrat_quadriennal.date_contrat," +
            		" contrat_quadriennal.duree, ue.nsemestre, ec.libelle as libelle_ec, ec.coef, " +
            		"semestre.libelle as libelle_semestre, typet.libelle as libelle_type " +
            		"FROM A_PASSE, EXAMEN,FORMATION,contrat_quadriennal, UE, EC, SEMESTRE, TYPET" +
            		" Where A_PASSE.NEXAMEN=EXAMEN.NEXAMEN " +
            		"and FORMATION.NCONTRAT=CONTRAT_QUADRIENNAL.NCONTRAT and EXAMEN.NEC=EC.NEC " +
            		"and EC.NUE=UE.NUE and ue.nsemestre=semestre.nsemestre and examen.ntype=typet.ntype" +
            		" and A_PASSE.netudiant=? and EXAMEN.NFORMATION=?");
            pst.setInt(1, st.getNumeroEtudiant());         
            pst.setInt(2, numeroFormation);
            ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                	Contrat_Quadrienal contrat= new Contrat_Quadrienal();
                    Formation formation=new Formation();
                    Semestre semestre=new Semestre();
                    UE ue=new UE();
                    EC ec=new EC();
                    TypeT type=new TypeT();
                    Examen examen = new Examen();
                    ResultatExamen note= new ResultatExamen();
                    
                    contrat.setNumeroContrat(rs.getInt("NCONTRAT"));
                    contrat.setDateContrat(rs.getDate("DATE_CONTRAT"));
                    contrat.setDuree(rs.getFloat("DUREE"));
                    System.out.println("contrat: "+contrat.getNumeroContrat());
                    
                    formation.setContrat(contrat);
                    formation.setNumeroFormation(rs.getInt("NFORMATION"));
                    formation.setLibelle(rs.getString("LIBELLE_FORMATION"));
                    formation.setNiveau(rs.getString("NIVEAU"));
                    formation.setType(rs.getString("TYPE_FORMATION"));
                    formation.setParcours(rs.getString("PARCOURS"));
                    System.out.println("formation: "+formation.getNumeroFormation());
                    
                    semestre.setNumeroSemestre(rs.getInt("NSEMESTRE"));
                    semestre.setLibelle(rs.getString("libelle_semestre"));
                    System.out.println("semestre: "+semestre.getNumeroSemestre());
                    
                    ue.setNumeroUE(rs.getInt("NUE"));
                    ue.setFormation(formation);
                    ue.setSemestre(semestre);
                    System.out.println("UE: "+ue.getNumeroUE());
                    
                    ec.setNumeroEC(rs.getInt("NEC"));
                    ec.setUe(ue);
                    ec.setFormation(formation);
                    ec.setLibelle(rs.getString("libelle_ec"));
                    ec.setCoef(rs.getFloat("coef"));
                    System.out.println("ec: "+ ec.getNumeroEC() + ", libelle: "+ec.getLibelle());
                    
                    type.setNumeroType(rs.getInt("NTYPE"));
                    type.setLibelle(rs.getString("libelle_type"));
                    System.out.println("type: "+type.getNumeroType()+ ", libelle: "+type.getLibelle()+ ", class: "+type.getClass());
                    
                    examen.setUe(ue);
                    examen.setEc(ec);
                    examen.setFormation(formation);
                    examen.setDateExamen(rs.getDate("DATE_EXAMEN"));
                    examen.setLibelle(rs.getString("libelle_examen"));
                    examen.setHoraire(rs.getString("HORAIRE"));
                    examen.setPoucentage(rs.getFloat("POURCENTAGE"));
                    examen.setType(type);
                    System.out.println("examen: "+examen.getNumeroExamen() +", libelle: "+examen.getLibelle());
                    
                    note.setEtudiant(st);
                    note.setExamen(examen);
                    note.setNote(rs.getDouble("NOTE"));
                    System.out.println("note: "+ note.getNote());
                    
                    st.addResultatExamen(note);                    
                }
                rs.close();
                pst.close();
        } catch (SQLException e) {
            e.getMessage();
        }
        System.out.println("je suis dans la fonction affectResultatExamen");
    }

	public void affectPromotionEtudiant(Etudiant st) throws SQLException{
		try {
			System.out.println(cx);
			PreparedStatement pst = cx.prepareStatement("SELECT * FROM EST_DANS inner join (PROMOTION inner join (FORMATION inner join CONTRAT_QUADRIENNAL on FORMATION.NCONTRAT=CONTRAT_QUADRIENNAL.NCONTRAT) on PROMOTION.NFORMATION=FORMATION.NFORMATION) on EST_DANS.NPROMOTION=PROMOTION.NPROMOTION WHERE netudiant=?");
			pst.setInt(1, st.getNumeroEtudiant());
			System.out.println("pst.execute() vaut: "+pst.execute());

			ResultSet rs = pst.executeQuery();
			System.out.println(rs);
			System.out.println("rs.next() vaut "+rs.next());
			while (rs.next()) {
				Contrat_Quadrienal contrat= new Contrat_Quadrienal();
				Formation formation=new Formation();
				Promotion promotion=new Promotion();
				PromotionEtudiant promotionEtudiant= new PromotionEtudiant();
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
			pst.close();
		} catch (SQLException e) {
			e.getMessage();
		}
	}
	public ResultSet recupNumFormPromUeEc(int numEns){
		String requete ;
		ResultSet rs=null;
		requete = "SELECT * FROM CRENEAU WHERE NENSEIGNANT="+numEns;
		try {
			Statement st = cx.createStatement();
			rs = st.executeQuery(requete);

		}
		catch (SQLException e) {
			e.getMessage();
		}

		return rs;

	}

	public String recupNonForm(int numform){
		String requete ;
		String nom="";
		ResultSet rs=null;
		requete = "SELECT LIBELLE FROM FORMATION WHERE NFORMATION="+numform;
		try {
			Statement st = cx.createStatement();
			rs = st.executeQuery(requete);

			while (rs.next()) {

				nom=rs.getString("LIBELLE");

			}
			rs.close();
			st.close();
		}
		catch (SQLException e) {
			e.getMessage();
		}


		return nom;


	}
	public String recupNonEC(int numEC){
		String requete ;
		ResultSet rs=null;
		String nom="";
		requete = "SELECT LIBELLE FROM EC WHERE NEC="+numEC;
		try {
			Statement st = cx.createStatement();
			rs = st.executeQuery(requete);
			while (rs.next()) {

				nom=rs.getString("LIBELLE");

			}
			rs.close();
			st.close();
		}
		catch (SQLException e) {
			e.getMessage();
		}

		return nom;

	}
}

