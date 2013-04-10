package fr.paris10.miage.gnote.univcmp.actionform;
import org.apache.struts.action.ActionForm;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/***** ceci est le form associé a la jsp welcome.jsp pour l'authentification******/
public class LoginForm extends ActionForm {
	private String login=null;
	private String mdp=null;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public ActionErrors validate( ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if(login.isEmpty()||mdp.isEmpty()){
			errors.add("",new ActionMessage(""));
		}



		return errors;
	}



}
