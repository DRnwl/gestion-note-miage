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
		String s="<li>"+this.formation.getType()+this.formation.getNiveau()+" "+this.formation.getLibelle()+" "+this.formation.getParcours()+"<input type=radio name=choix value="+this.getFormation().getNumeroFormation()+ " /></li>";
		return s;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((formation == null) ? 0 : formation.hashCode());
		result = prime * result + numeroPromotion;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Promotion other = (Promotion) obj;
		if (formation == null) {
			if (other.formation != null)
				return false;
		} else if (!formation.equals(other.formation))
			return false;
		if (numeroPromotion != other.numeroPromotion)
			return false;
		return true;
	}
	
}
