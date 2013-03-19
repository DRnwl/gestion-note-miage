package fr.paris10.miage.gnote.univcmp.actionform;
import org.apache.struts.action.ActionForm;


public class WelcomeForm extends ActionForm {
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
	
	
	

}
