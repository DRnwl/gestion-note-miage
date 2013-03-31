package fr.paris10.miage.gnote.univcmp.actions;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.ResultSet;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import fr.paris10.miage.gnote.univcmp.actionform.LoginForm;
import fr.paris10.miage.gnote.univcmp.basedonnees.QueryBD;
import fr.paris10.miage.gnote.usercmp.bean.Candidat;
import fr.paris10.miage.gnote.usercmp.bean.Enseignant;
import fr.paris10.miage.gnote.usercmp.bean.Etudiant;




public class LoginAction extends Action  {
	public ActionForward execute( ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response )throws Exception {
		ResultSet rs;
		LoginForm monLoginForm =(LoginForm) form;
		ServletContext context = getServlet().getServletContext();
		QueryBD conBase = new QueryBD(context.getRealPath(""));



		if ((conBase.comparerIdentifiant(monLoginForm.getLogin(), monLoginForm.getMdp())).equals("enseignant")) {
			rs= conBase.recupIdentite("enseignant",monLoginForm.getLogin(),monLoginForm.getMdp());
              Enseignant user=new Enseignant();
              while (rs.next()) {

					user.setNom(rs.getString("NOM"));
					user.setPrenom(rs.getString("PRENOM"));
				}
              request.setAttribute("user", user); 
			return mapping.findForward("enseignant");
		} else {
			if ((conBase.comparerIdentifiant(monLoginForm.getLogin(), monLoginForm.getMdp())).equals("secretariat"))  {
				rs= conBase.recupIdentite("secretariat",monLoginForm.getLogin(),monLoginForm.getMdp());
				Enseignant user=new Enseignant();
	              while (rs.next()) {

						user.setNom(rs.getString("NOM"));
						user.setPrenom(rs.getString("PRENOM"));
					}
				
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
					System.out.println(user.getListPromotionEtudiant().size());
					request.setAttribute("user", user);
		            request.setAttribute("candidat",candidat);

					return mapping.findForward("etudiant");
				}else{
					return mapping.findForward("erreur");
				}
			}

		}

	}


}

