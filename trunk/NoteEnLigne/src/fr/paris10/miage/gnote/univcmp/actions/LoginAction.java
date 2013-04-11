package fr.paris10.miage.gnote.univcmp.actions;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import fr.paris10.miage.gnote.univcmp.actionform.LoginForm;
import fr.paris10.miage.gnote.univcmp.basedonnees.QueryBD;
import fr.paris10.miage.gnote.univcmp.bean.EC;
import fr.paris10.miage.gnote.univcmp.bean.Formation;
import fr.paris10.miage.gnote.univcmp.bean.UE;
import fr.paris10.miage.gnote.usercmp.bean.Candidat;
import fr.paris10.miage.gnote.usercmp.bean.Enseignant;
import fr.paris10.miage.gnote.usercmp.bean.Etudiant;

/*** ceci est la servelet qui traite l'authentification****/


public class LoginAction extends Action  {
	public ActionForward execute( ActionMapping mapping
			,ActionForm form,HttpServletRequest request
			,HttpServletResponse response )
			throws SQLException {
		ResultSet rs=null;
		// instanciation de la form pour l'authentification
		LoginForm monLoginForm =(LoginForm) form;
		ServletContext context = getServlet().getServletContext();
		// intanciation de QueryBD de données 
		QueryBD conBase = new QueryBD(context.getRealPath(""));

		HttpSession session = request.getSession(true);
		/* verification dans la base de donnée du statut de la personne 
		 connecté*/ 
		if ((conBase.comparerIdentifiant(monLoginForm.getLogin(), monLoginForm.getMdp())).equals("enseignant")) {
			rs= conBase.recupIdentite("enseignant",monLoginForm.getLogin(),monLoginForm.getMdp());
			Enseignant user=new Enseignant();
			while (rs.next()) {
				user.setNumeroEnseignant(rs.getInt("NENSEIGNANT"));
				user.setNom(rs.getString("NOM"));
				user.setPrenom(rs.getString("PRENOM"));
			}
			
			rs.close();
			/* recuperation des information relatif à l'enseignant
			connecté pour les afficher*/   
			rs=conBase.recupNumFormPromUeEc(user.getNumeroEnseignant());

			while (rs.next()) {
				Formation forma=new Formation();
				UE ue=new UE();
				EC ec=new EC();
				forma.setNumeroFormation(rs.getInt("NFORMATION"));
				ue.setNumeroUE(rs.getInt("NUE"));
				ec.setNumeroEC(rs.getInt("NEC"));
				forma.setLibelle(conBase.recupNonForm(forma.getNumeroFormation()));
				ec.setLibelle(conBase.recupNonEC(ec.getNumeroEC()));
				user.getListForm().add(forma);
				user.getListeEc().add(ec);
				user.getListeEU().add(ue);

			} 
			rs.close();
			session.setAttribute("user", user); 
			return mapping.findForward("enseignant");
		} else {
			if ((conBase.comparerIdentifiant(monLoginForm.getLogin(), monLoginForm.getMdp())).equals("secretariat"))  {
				rs= conBase.recupIdentite("secretariat",monLoginForm.getLogin(),monLoginForm.getMdp());
				Enseignant user=new Enseignant();
				while (rs.next()) {

					user.setNom(rs.getString("NOM"));
					user.setPrenom(rs.getString("PRENOM"));
				}
				rs.close();
				return mapping.findForward("secretariat");

			}else {
				if((conBase.comparerIdentifiant(monLoginForm.getLogin(), monLoginForm.getMdp())).equals("etudiant")){
					rs= conBase.recupIdentite("etudiant",monLoginForm.getLogin(),monLoginForm.getMdp());
					Etudiant user=new Etudiant();
					Candidat candidat =new Candidat();
					while (rs.next()) {
						candidat.setNumeroCandidat(rs.getInt("NCANDIDAT"));
						candidat.setNom(rs.getString("NOM"));
						candidat.setPrenom(rs.getString("PRENOM"));
						candidat.setAdresse(rs.getString("ADRESSE"));
						candidat.setTelephone(rs.getString("TELEPHONE"));
						candidat.setDateNaissance(rs.getDate("DATENAISSANCE"));
						candidat.setLogin(rs.getString("LOG_IN"));
						candidat.setPassword(rs.getString("MOT_DE_PASSE"));
						candidat.setDate(rs.getDate("DATE_CANDIDAT"));
						candidat.setEtatDossier(rs.getString("ETAT_DU_DOSSIER"));
						candidat.setEmail(rs.getString("EMAIL"));
						user.setCandidat(candidat);
						user.setNumeroEtudiant(rs.getInt("NETUDIANT"));
						user.setModeEvaluation(rs.getString("MODEEVALUATION"));
					}
					conBase.affectPromotionEtudiant(user);
					session.setAttribute("user", user);
					session.setAttribute("candidat",candidat);
					rs.close(); 
					return mapping.findForward("etudiant");
				}else{
					return mapping.findForward("erreur");
				}
			}

		}
		
	}

   
}

