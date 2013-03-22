package fr.paris10.miage.gnote.univcmp.controleur;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import fr.paris10.miage.gnote.univcmp.actionform.LoginForm;
import fr.paris10.miage.gnote.univcmp.basedonnees.QueryBD;




public class LoginAction extends Action  {
	public ActionForward execute( ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response )throws Exception {

		LoginForm monLoginForm =(LoginForm) form;
		ServletContext context = getServlet().getServletContext();
		QueryBD conBase = new QueryBD(context.getRealPath(""));


		if ((conBase.comparerIdentifiant(monLoginForm.getLogin(), monLoginForm.getMdp())).equals("enseignant")) {
			return mapping.findForward("enseignant");
		} else {
			if ((conBase.comparerIdentifiant(monLoginForm.getLogin(), monLoginForm.getMdp())).equals("secretariat"))  {
				return mapping.findForward("secretariat");
			}else {
				if((conBase.comparerIdentifiant(monLoginForm.getLogin(), monLoginForm.getMdp())).equals("etudiant")){
					return mapping.findForward("etudiant");
				}else{
					return mapping.findForward("erreur");
				}
			}

		}
	}
}


