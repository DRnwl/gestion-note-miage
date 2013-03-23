package fr.paris10.miage.gnote.univcmp.actions;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import fr.paris10.miage.gnote.univcmp.actionform.LoginForm;




public class LoginAction extends Action  {
 public ActionForward execute( ActionMapping mapping,ActionForm form,
		 HttpServletRequest request,HttpServletResponse response )throws Exception {
 
	 LoginForm monLoginForm =(LoginForm) form;
	 
	
	 // code metier interrogation base de données 
	 
	 if(monLoginForm.getLogin().equals("saliha")&&(monLoginForm.getMdp().equals("karima"))){
		 return mapping.findForward("success");
	 }
	 return mapping.findForward("erreur");
 }
 }

