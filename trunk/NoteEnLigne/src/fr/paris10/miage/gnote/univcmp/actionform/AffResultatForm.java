package fr.paris10.miage.gnote.univcmp.actionform;
import org.apache.struts.action.ActionForm;

public class AffResultatForm extends ActionForm{
	private String choix=null;

	public String getChoix() {
		return choix;
	}

	public void setChoix(String choix) {
		this.choix = choix;
	}
	
}
