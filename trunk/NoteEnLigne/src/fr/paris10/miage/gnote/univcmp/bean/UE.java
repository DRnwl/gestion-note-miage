package fr.paris10.miage.gnote.univcmp.bean;


public class UE {
	/**
	 * Les différents attributs ainsi que leur visibilité
	 */
	private int numeroUE;
	private Semestre semestre;
	private Formation formation;
	//private String libelle;

	/**
	 * Conctructeur sans parametre.
	 */

	public UE() {
	}


	/***********************************************************************************************************************
	 ****************************************************** LES GETTERS******************************************************
	 ***********************************************************************************************************************/

	public int getNumeroUE() {
		return numeroUE;
	}

	

	public Semestre getSemestre() {
		return semestre;
	}


	public Formation getFormation() {
		return formation;
	}


	/*public String getLibelle() {
		return libelle;
	}*/

	

	/***********************************************************************************************************************
	 ****************************************************** LES SETTERS******************************************************
	 ***********************************************************************************************************************/

	/*public void setLibelle(String libelle) {
		this.libelle = libelle;
	}*/


	public void setNumeroUE(int numeroUE) {
		this.numeroUE = numeroUE;
	}


	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}


	public void setFormation(Formation formation) {
		this.formation = formation;
	}
	
}
