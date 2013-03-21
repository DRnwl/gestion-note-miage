
package fr.paris10.miage.gnote.univcmp.bean;

/**
 * Classe repr�sentant la promotion d'un �tudiant
 * Correspond � la table EST_DANS de la BDD
 * @author Lydie Tiago
 * @version 1.0
 * 
 */
public class PromotionEtudiant {

	/**
	 * Les diff�rents attributs ainsi que leur visibilit�
	 */
	private int numeroEtudiant;
	private int numeroPromotion;
	
	

	/**
	 * Conctructeur sans parametre.
	 */

	public PromotionEtudiant() {
	}

	/**
	 * Le constructeur avec param�tres
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