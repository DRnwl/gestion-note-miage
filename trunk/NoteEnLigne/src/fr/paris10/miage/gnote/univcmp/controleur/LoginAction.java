package fr.paris10.miage.gnote.univcmp.controleur;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import fr.paris10.miage.gnote.univcmp.actionform.WelcomeForm;
import fr.paris10.miage.gnote.univcmp.bean.Enseignant;



public class LoginAction extends Action  {
 public ActionForward execute( ActionMapping mapping,ActionForm form,
		 HttpServletRequest request,HttpServletResponse response )throws Exception {
 
	 WelcomeForm monLoginForm =(WelcomeForm) form;
	 Enseignant monEnseignant =new Enseignant(); 
	 monEnseignant.setPwd(monLoginForm.getMdp());
	 monEnseignant.setLogin(monLoginForm.getLogin());
	 request.setAttribute(mapping.getAttribute(),monEnseignant);
	 // code metier interrogation base de données 
	 
	 if(monEnseignant.getLogin().equals("saliha")&&(monEnseignant.getPwd().equals("karima"))){
		 return mapping.findForward("success");
	 }
	 return mapping.findForward("erreur");
 }
 }

