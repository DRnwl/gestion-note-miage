
package fr.paris10.miage.gnote.univcmp.bean;

import fr.paris10.miage.gnote.usercmp.bean.Etudiant;

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
	private Etudiant etudiant;
	private Promotion promotion;
	
	

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

	public PromotionEtudiant(Etudiant etudiant, Promotion promotion) {

		this.etudiant = etudiant;
		this.promotion = promotion;
		
		
	}

	/***********************************************************************************************************************
	 ****************************************************** LES GETTERS******************************************************
	 ***********************************************************************************************************************/

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public Promotion getPromotion() {
		return promotion;
	}
	/***********************************************************************************************************************
	 ****************************************************** LES SETTERS******************************************************
	 ***********************************************************************************************************************/

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}
}