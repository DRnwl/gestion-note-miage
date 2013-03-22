package fr.paris10.miage.gnote.univcmp.bean;

/**
 * Classe représentant la promotion d'un étudiant
 * 
 * @author Patrick Kasongo
 * @version 1.0
 * 
 */
public class Promotion {

	/**
	 * Les différents attributs ainsi que leur visibilité
	 */

	private String numeroPromotion;
	private String numeroFormation;
	private String libelle;

	/**
	 * Conctructeur sans parametre.
	 */

	public Promotion() {
	}

	/**
	 * Le constructeur avec paramètres
	 * 
	 * @param numeroPromotion
	 * @param numeroFormation
	 * @param libelle
	 */

	public Promotion(String numeroPromotion, String numeroFormation,
			String libelle) {

		this.numeroPromotion = numeroPromotion;
		this.numeroFormation = numeroFormation;
		this.libelle = libelle;

	}

	/***********************************************************************************************************************
	 ****************************************************** LES GETTERS******************************************************
	 ***********************************************************************************************************************/

	public String getNumeroPromotion() {
		return numeroPromotion;
	}

	public String getNumeroFormation() {
		return numeroFormation;
	}

	public String getLibelle() {
		return libelle;
	}

	/***********************************************************************************************************************
	 ****************************************************** LES SETTERS******************************************************
	 ***********************************************************************************************************************/

	public void setNumeroPromotion(String numeroPromotion) {
		this.numeroPromotion = numeroPromotion;
	}

	public void setNumeroFormation(String numeroFormation) {
		this.numeroFormation = numeroFormation;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
