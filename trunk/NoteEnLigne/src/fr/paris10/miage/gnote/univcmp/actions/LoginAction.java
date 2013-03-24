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
import fr.paris10.miage.gnote.usercmp.bean.Etudiant;




public class LoginAction extends Action  {
	public ActionForward execute( ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response )throws Exception {
		ResultSet rs;
		LoginForm monLoginForm =(LoginForm) form;
		ServletContext context = getServlet().getServletContext();
		QueryBD conBase = new QueryBD(context.getRealPath(""));



		if ((conBase.comparerIdentifiant(monLoginForm.getLogin(), monLoginForm.getMdp())).equals("enseignant")) {
			//rs= conBase.recupIdentite("enseignant",monLoginForm.getLogin(),monLoginForm.getMdp());

			return mapping.findForward("enseignant");
		} else {
			if ((conBase.comparerIdentifiant(monLoginForm.getLogin(), monLoginForm.getMdp())).equals("secretariat"))  {
				//rs= conBase.recupIdentite("secretariat",monLoginForm.getLogin(),monLoginForm.getMdp());
				return mapping.findForward("secretariat");
			}else {
				if((conBase.comparerIdentifiant(monLoginForm.getLogin(), monLoginForm.getMdp())).equals("etudiant")){
					rs= conBase.recupIdentite("etudiant",monLoginForm.getLogin(),monLoginForm.getMdp());
					Candidat user =new Candidat();
					while (rs.next()) {

						user.setNom(rs.getString("NOM"));
						user.setPrenom(rs.getString("PRENOM"));
					}
					request.setAttribute("user", user);
					return mapping.findForward("etudiant");
				}else{
					return mapping.findForward("erreur");
				}
			}

		}

	}


}

