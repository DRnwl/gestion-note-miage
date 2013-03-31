package fr.paris10.miage.gnote.univcmp.bean;

public class Promotion {

	/**
	 * Les différents attributs ainsi que leur visibilité
	 */

	private int numeroPromotion;
	private Formation formation;


	/**
	 * Conctructeur sans parametre.
	 */

	public Promotion() {
	}

	/**
	 * Le constructeur avec param�tres
	 * 
	 * @param numeroPromotion
	 * @param formation
	 */
	public Promotion(int numeroPromotion, Formation formation) {
		super();
		this.numeroPromotion = numeroPromotion;
		this.formation = formation;
	}
	
	/***********************************************************************************************************************
	 ****************************************************** LES GETTERS/LES SETTERS******************************************************
	 ***********************************************************************************************************************/


	public int getNumeroPromotion() {
		return numeroPromotion;
	}


	public void setNumeroPromotion(int numeroPromotion) {
		this.numeroPromotion = numeroPromotion;
	}


	public Formation getFormation() {
		return formation;
	}


	public void setFormation(Formation formation) {
		this.formation = formation;
	}
	
	/***********************************************************************************************************************
	 ****************************************************** AFFICHAGE******************************************************
	 ***********************************************************************************************************************/
	public String toString(){
		String s="<li>"+this.formation.getType()+this.formation.getNiveau()+" "+this.formation.getLibelle()+" "+this.formation.getParcours()+"</li>";
		return s;
	}
	
}
