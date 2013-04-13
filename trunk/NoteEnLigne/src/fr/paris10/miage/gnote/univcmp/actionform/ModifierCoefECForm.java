package fr.paris10.miage.gnote.univcmp.actionform;
import org.apache.struts.action.ActionForm;

public class ModifierCoefECForm extends ActionForm{
	private String coef=null;
	private String libelle=null;

	public String getCoef() {
		return coef;
	}

	public void setCoef(String coef) {
		this.coef = coef;
	}
	
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
}
