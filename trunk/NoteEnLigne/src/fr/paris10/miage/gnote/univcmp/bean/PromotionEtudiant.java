
package fr.paris10.miage.gnote.univcmp.bean;

/**
 * Classe représentant la promotion d'un étudiant
 * Correspond à la table EST_DANS de la BDD
 * @author Lydie Tiago
 * @version 1.0
 * 
 */
public class PromotionEtudiant {

	/**
	 * Les différents attributs ainsi que leur visibilité
	 */
	private int numeroEtudiant;
	private int numeroPromotion;
	
	

	/**
	 * Conctructeur sans parametre.
	 */

	public PromotionEtudiant() {
	}

	/**
	 * Le constructeur avec paramètres
	 * 
	 * @param numeroPromotion
	 * @param numeroFormation
	 * @param libelle
	 */

	public PromotionEtudiant(int numeroEtudiant, int numeroPromotion) {

		this.numeroEtudiant = numeroEtudiant;
		this.numeroPromotion = numeroPromotion;
		
		
	}

	/***********************************************************************************************************************
	 ****************************************************** LES GETTERS******************************************************
	 ***********************************************************************************************************************/

	public int getNumeroEtudiant() {
		return numeroEtudiant;
	}

	public int getNumeroPromotion() {
		return numeroPromotion;
	}
	/***********************************************************************************************************************
	 ****************************************************** LES SETTERS******************************************************
	 ***********************************************************************************************************************/

	public void setNumeroEtudiant(int numeroEtudiant) {
		this.numeroEtudiant = numeroEtudiant;
	}

	public void setNumeroPromotion(int numeroPromotion) {
		this.numeroPromotion = numeroPromotion;
	}
}