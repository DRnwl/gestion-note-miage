package fr.paris10.miage.gnote.univcmp.bean;

public class Promotion {

	/**
	 * Les différents attributs ainsi que leur visibilité
	 */

	private int numeroPromotion;
	private Formation formation;
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

	public Promotion(int numeroPromotion, Formation formation) {

		this.numeroPromotion = this.nextPromotion++;
		this.formation = formation;

	}

	/***********************************************************************************************************************
	 ****************************************************** LES GETTERS******************************************************
	 ***********************************************************************************************************************/

	public int getNumeroPromotion() {
		return numeroPromotion;
	}

	public Formation getFormation() {
		return formation;
	}
	

	
	public static int getNextPromotion() {
		return nextPromotion;
	}

	/***********************************************************************************************************************
	 ****************************************************** LES SETTERS******************************************************
	 ***********************************************************************************************************************/

	public void setNumeroFormation(Formation numeroFormation) {
		this.formation = formation;
	}

	
}
