package fr.paris10.miage.gnote.univcmp.basedonnees;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
import fr.paris10.miage.gnote.usercmp.bean.Enseignant;
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
			 e.toString();

		}
		try {
			prop.load(in);
			driver= prop.getProperty("BdDriver");
			url = prop.getProperty("BdUrl");
			login = prop.getProperty("BDlogin");
			pwd = prop.getProperty("BDpwd");
			in.close();
		} catch (IOException e) {
			 e.toString();
		}
		try {
			Class.forName(driver);//driver
		} catch (Exception ex) {
			ex.getMessage();
			
		}
		try {
			cx = DriverManager.getConnection(url,login,pwd);// url login pwd

		} catch (SQLException ex) {
			 ex.toString();
		}
	}

	public void closeCo() {
		try {
			cx.close();
		} catch (SQLException ex) {
			 ex.toString();
		}
	}

	/**** requete vers la base de donnÃ©es 
	 * @throws SQLException ***/ 
	public boolean executerRequete(String requete) throws SQLException {
		Statement st=null;
		ResultSet rs=null;
		
		try {
			 st = cx.createStatement();

			 rs = st.executeQuery(requete);
			if (rs.next()) {
				rs.close();
				st.close();
				return true;
			}
			rs.close();
			st.close();
			return false;
		} catch (SQLException ex) {
			 ex.toString();
		}finally{
			rs.close();
			st.close();
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
		String requete="" ;
		ResultSet rs=null;
		if(type.equals("etudiant")){
			requete ="SELECT * FROM CANDIDAT inner join ETUDIANT on CANDIDAT.NCANDIDAT=ETUDIANT.NCANDIDAT WHERE CANDIDAT.LOG_IN = '" + login + "' AND CANDIDAT.MOT_DE_PASSE = '" + pwd + "'";

		}else{
			if(type.equals("scretatriat")){
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

	public void affectResultatExamenFormation(Etudiant st, int numeroFormation)
			    throws SQLException{
       // cette methode affect un résultat a un étudiant 
		try {
			PreparedStatement pst = cx.prepareStatement("SELECT distinct a_passe.netudiant, a_passe.nexamen, " +
					"a_passe.note, examen.date_examen, examen.ntype, examen.nue, examen.nec, examen.horaire, " +
					"examen.libelle as libelle_examen, examen.pourcentage,formation.nformation, " +
					"formation.ncontrat, formation.libelle as libelle_formation, formation.niveau, " +
					"formation.type_formation, formation.parcours, contrat_quadriennal.date_contrat, " +
					"contrat_quadriennal.duree, ue.nsemestre, ec.libelle as libelle_ec, ec.coef, " +
					"semestre.libelle as libelle_semestre, typet.libelle as libelle_type " +
					"FROM A_PASSE, EXAMEN,FORMATION,contrat_quadriennal, UE, EC, SEMESTRE, TYPET " +
					"Where A_PASSE.NEXAMEN=EXAMEN.NEXAMEN and EXAMEN.NFORMATION=FORMATION.NFORMATION " +
					"and FORMATION.NFORMATION=? and FORMATION.NCONTRAT=CONTRAT_QUADRIENNAL.NCONTRAT " +
					"and EXAMEN.NEC=EC.NEC and EC.NUE=UE.NUE and ue.nsemestre=semestre.nsemestre " +
					"and examen.ntype=typet.ntype and A_PASSE.netudiant=?");
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
				
				formation.setContrat(contrat);
				formation.setNumeroFormation(rs.getInt("NFORMATION"));
				formation.setLibelle(rs.getString("LIBELLE_FORMATION"));
				formation.setNiveau(rs.getString("NIVEAU"));
				formation.setType(rs.getString("TYPE_FORMATION"));
				formation.setParcours(rs.getString("PARCOURS"));
				
				semestre.setNumeroSemestre(rs.getInt("NSEMESTRE"));
				semestre.setLibelle(rs.getString("libelle_semestre"));
				
				ue.setNumeroUE(rs.getInt("NUE"));
				ue.setFormation(formation);
				ue.setSemestre(semestre);
				
				ec.setNumeroEC(rs.getInt("NEC"));
				ec.setUe(ue);
				ec.setFormation(formation);
				ec.setLibelle(rs.getString("libelle_ec"));
				ec.setCoef(rs.getFloat("coef"));
				
				type.setNumeroType(rs.getInt("NTYPE"));
				type.setLibelle(rs.getString("libelle_type"));
				
				examen.setUe(ue);
				examen.setEc(ec);
				examen.setFormation(formation);
				examen.setDateExamen(rs.getDate("DATE_EXAMEN"));
				examen.setLibelle(rs.getString("libelle_examen"));
				examen.setHoraire(rs.getString("HORAIRE"));
				examen.setPoucentage(rs.getFloat("POURCENTAGE"));
				examen.setType(type);
				
				note.setEtudiant(st);
				note.setExamen(examen);
				note.setNote(rs.getDouble("NOTE"));
				
				st.addResultatExamen(note);                    
			}
			rs.close();
			pst.close();
		} catch (SQLException e) {
			e.getMessage();
		}
	}

	public void affectPromotionEtudiant(Etudiant st) throws SQLException{
		try {
			PreparedStatement pst = cx.prepareStatement("SELECT * FROM EST_DANS inner join (PROMOTION inner join (FORMATION inner join CONTRAT_QUADRIENNAL on FORMATION.NCONTRAT=CONTRAT_QUADRIENNAL.NCONTRAT) on PROMOTION.NFORMATION=FORMATION.NFORMATION) on EST_DANS.NPROMOTION=PROMOTION.NPROMOTION WHERE netudiant=?");
			pst.setInt(1, st.getNumeroEtudiant());
			
			ResultSet rs = pst.executeQuery();
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
	/* recueration des identifiant formation, promotion , ue et Ec concernant 
	un enseignant*/
	public Enseignant recupNumFormPromUeEc(int numEns) throws SQLException{
		String requete ;
		ResultSet rs=null;
		Statement st=null;
		Enseignant user= new Enseignant();
		requete = "SELECT * FROM CRENEAU WHERE NENSEIGNANT="+numEns;
		
			
      try{
    	    st = cx.createStatement();
			rs = st.executeQuery(requete);
			while (rs.next()) {
				Formation forma=new Formation();
				UE ue=new UE();
				EC ec=new EC();
				forma.setNumeroFormation(rs.getInt("NFORMATION"));
				ue.setNumeroUE(rs.getInt("NUE"));
				ec.setNumeroEC(rs.getInt("NEC"));
				forma.setLibelle(this.recupNonForm(forma.getNumeroFormation()));
				ec.setLibelle(this.recupNonEC(ec.getNumeroEC()));
				user.getListForm().add(forma);
				user.getListeEc().add(ec);
				user.getListeEU().add(ue);

			} 
			rs.close();
			st.close();
			return user;
		}
		catch (SQLException e) {
			e.getMessage();
		}finally{
			rs.close();
			st.close();
			
		}

		return null;

	}
	
	//recupération de l'ensemble des formations
	public void affectListFormation(Enseignant e) throws SQLException{
		String requete ;
		Statement st=null;
		ResultSet rs=null;
		requete = "SELECT * FROM FORMATION";
		try {
		    st = cx.createStatement();
			rs = st.executeQuery(requete);

			while (rs.next()) {
				int numero=rs.getInt("NFORMATION");
				String libelle=rs.getString("LIBELLE");
				String niveau=rs.getString("NIVEAU");
				String type=rs.getString("TYPE_FORMATION");
				String parcours=rs.getString("PARCOURS");
				Formation form=new Formation();
				form.setNumeroFormation(numero);
				form.setLibelle(libelle);
				form.setNiveau(niveau);
				form.setType(type);
				form.setParcours(parcours);
				e.getListFormations().add(form);		

			}
			rs.close();
			st.close();
		}
		catch (SQLException ex) {
			ex.getMessage();
		}finally{
			rs.close();
			st.close();
		}

	}

	// extraction du libelle de la formation avec son id 
	
	public String recupNonForm(int numform) throws SQLException{
		String requete ;
		String nom="";
		Statement st=null;
		ResultSet rs=null;
		requete = "SELECT LIBELLE FROM FORMATION WHERE NFORMATION="+numform;
		try {
		    st = cx.createStatement();
			rs = st.executeQuery(requete);

			while (rs.next()) {

				nom=rs.getString("LIBELLE");

			}
			rs.close();
			st.close();
		}
		catch (SQLException e) {
			e.getMessage();
		}finally{
			rs.close();
			st.close();
		}


		return nom;


	}
	// recuperation du nom de l'uc
	public String recupNonEC(int numEC) throws SQLException{
		String requete ;
		ResultSet rs=null;
		Statement st=null;
		String nom="";
		requete = "SELECT LIBELLE FROM EC WHERE NEC="+numEC;
		try {
			 st = cx.createStatement();
			rs = st.executeQuery(requete);
			while (rs.next()) {

				nom=rs.getString("LIBELLE");

			}
			rs.close();
			st.close();
		}
		catch (SQLException e) {
			e.getMessage();
		}finally{
			rs.close();
			st.close();
		}

		return nom;

	}
	
	// insertion d'un examen 
	public int insertExam( String date,int numt, int numForm,int ue,
			int ec,String heure,String libelle, int pour)throws SQLException {
		String requete="";
		 requete="INSERT INTO EXAMEN (NEXAMEN, DATE_EXAMEN, NTYPE, NFORMATION, NUE, NEC, HORAIRE, LIBELLE, POURCENTAGE) VALUES (SEQ_EXAMEN.NEXTVAL, TO_DATE('"+date+"','DD/MM/RR'),"+numt+","+numForm+","+ue+","+ec+",'"+heure+"','"+libelle+"',"+pour+")";
		int resInsert=0;
		try {
			Statement st = cx.createStatement();
			resInsert = st.executeUpdate(requete);
			st.close();

		}

		catch (SQLException e) {
			e.getMessage();
		}

		return resInsert;
	}
	public void fermerConnexio() throws SQLException{
		cx.close();
	}
}

