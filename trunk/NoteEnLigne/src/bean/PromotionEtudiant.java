
package bean;

/**
 * Classe représentant la promotion d'un étudiant
 * 
 * @author Patrick Kasongo
 * @version 1.0
 * 
 */
public class PromotionEtudiant {

	/**
	 * Les différents attributs ainsi que leur visibilité
	 */
	private String idPromotionEtudiant;
	private String numeroEtudiant;
	private String numeroPromotion;
	
	

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

	public PromotionEtudiant(String idPromotionEtudiant, String numeroEtudiant, String numeroPromotion) {

		this.idPromotionEtudiant = idPromotionEtudiant;
		this.numeroEtudiant = numeroEtudiant;
		this.numeroPromotion = numeroPromotion;
		
		
	}

	/***********************************************************************************************************************
	 ****************************************************** LES GETTERS******************************************************
	 ***********************************************************************************************************************/
	public String getIdPromotionEtudiant() {
		return idPromotionEtudiant;
	}

	public String getNumeroEtudiant() {
		return numeroEtudiant;
	}

	public String getNumeroPromotion() {
		return numeroPromotion;
	}
	/***********************************************************************************************************************
	 ****************************************************** LES SETTERS******************************************************
	 ***********************************************************************************************************************/
	public void setIdPromotionEtudiant(String idPromotionEtudiant) {
		this.idPromotionEtudiant = idPromotionEtudiant;
	}

	public void setNumeroEtudiant(String numeroEtudiant) {
		this.numeroEtudiant = numeroEtudiant;
	}

	public void setNumeroPromotion(String numeroPromotion) {
		this.numeroPromotion = numeroPromotion;
	}
}