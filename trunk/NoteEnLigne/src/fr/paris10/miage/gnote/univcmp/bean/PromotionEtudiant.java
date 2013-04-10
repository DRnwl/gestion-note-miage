
package fr.paris10.miage.gnote.univcmp.bean;

import fr.paris10.miage.gnote.usercmp.bean.Etudiant;


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

	/***********************************************************************************************************************
	 ****************************************************** Affichage******************************************************
	 ***********************************************************************************************************************/

	public String afficherPromotion(){
		return this.promotion.toString();
	}

}