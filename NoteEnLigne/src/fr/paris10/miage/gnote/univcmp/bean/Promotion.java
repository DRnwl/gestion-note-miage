package fr.paris10.miage.gnote.univcmp.bean;

/**
 * Classe représentant la promotion d'un étudiant
 * 
 * @author Lydie Tiago
 * @version 1.0
 * 
 */
public class Promotion {

	/**
	 * Les différents attributs ainsi que leur visibilité
	 */

	private int numeroPromotion;
	private int numeroFormation;
	private static int nextPromotion=0;
	//private String libelle;

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

	public Promotion(int numeroPromotion, int numeroFormation) {

		this.numeroPromotion = this.nextPromotion++;
		this.numeroFormation = numeroFormation;

	}

	/***********************************************************************************************************************
	 ****************************************************** LES GETTERS******************************************************
	 ***********************************************************************************************************************/

	public int getNumeroPromotion() {
		return numeroPromotion;
	}

	public int getNumeroFormation() {
		return numeroFormation;
	}
	

	
	public static int getNextPromotion() {
		return nextPromotion;
	}

	/***********************************************************************************************************************
	 ****************************************************** LES SETTERS******************************************************
	 ***********************************************************************************************************************/

	public void setNumeroFormation(int numeroFormation) {
		this.numeroFormation = numeroFormation;
	}

	
}
