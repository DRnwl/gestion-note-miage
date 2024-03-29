package fr.paris10.miage.gnote.univcmp.bean;



public class EC {
	/**
	 * Les différents attributs ainsi que leur visibilité
	 */
	private int numeroEC;
	private Formation formation;
	private UE ue;
	private String libelle;
	private float coef;

	/**
	 * Conctructeur sans parametre.
	 */

	public EC() {

		numeroEC=0;
		formation=null;
		ue=null;
		libelle="";
		coef=0;
	}

	/***********************************************************************************************************************
	 ****************************************************** LES GETTERS/SETTERS******************************************************
	 ***********************************************************************************************************************/

	public int getNumeroEC() {
		return numeroEC;
	}

	public void setNumeroEC(int numeroEC) {
		this.numeroEC = numeroEC;
	}

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}

	public UE getUe() {
		return ue;
	}

	public void setUe(UE ue) {
		this.ue = ue;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public float getCoef() {
		return coef;
	}

	public void setCoef(float coef) {
		this.coef = coef;
	}


	@Override
	public String toString() {
		return "EC [libelle=" + libelle + ", coef=" + coef + "]";
	}



}
