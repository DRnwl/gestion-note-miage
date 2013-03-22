package fr.paris10.miage.gnote.univcmp.bean;

/**
 * Classe repésentant la formation suivie par un étudiant
 * 
 * @author Patrick Kasongo
 * @version 1.0
 * 
 */
public class Formation {

	/**
	 * Les différents attributs ainsi que leur visibilité
	 */

	private String numeroFormation;
	private String libelle;
	private String niveau;
	private String type;
	private String parcours;

	/**
	 * Conctructeur sans parametre.
	 */

	public Formation() {
	}

	/**
	 * Le constructeur avec paramètre
	 * 
	 * @param numeroFormation
	 * @param libelle
	 * @param niveau
	 * @param type
	 * @param parcours
	 */

	public Formation(String numeroFormation, String libelle, String niveau,
			String type, String parcours) {

		this.numeroFormation = numeroFormation;
		this.libelle = libelle;
		this.niveau = niveau;
		this.type = type;
		this.parcours = parcours;

	}

	/***********************************************************************************************************************
	 ****************************************************** LES GETTERS******************************************************
	 ***********************************************************************************************************************/

	public String getNumeroFormation() {
		return numeroFormation;
	}

	public String getLibelle() {
		return libelle;
	}

	public String getNiveau() {
		return niveau;
	}

	public String getType() {
		return type;
	}

	public String getParcours() {
		return parcours;
	}

	/***********************************************************************************************************************
	 ****************************************************** LES SETTERS******************************************************
	 ***********************************************************************************************************************/

	public void setNumeroFormation(String numeroFormation) {
		this.numeroFormation = numeroFormation;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setParcours(String parcours) {
		this.parcours = parcours;
	}

}
