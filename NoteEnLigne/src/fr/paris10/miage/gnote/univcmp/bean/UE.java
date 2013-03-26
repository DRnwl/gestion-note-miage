package fr.paris10.miage.gnote.univcmp.bean;


public class UE {
	/**
	 * Les différents attributs ainsi que leur visibilité
	 */
	private int numeroUE;
	private int numeroSemestre;
	private int numeroFormation;
	private String libelle;

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

	public int getNumeroSemestre() {
		return numeroSemestre;
	}

	public int getNumeroFormation() {
		return numeroFormation;
	}

	public String getLibelle() {
		return libelle;
	}

	

	/***********************************************************************************************************************
	 ****************************************************** LES SETTERS******************************************************
	 ***********************************************************************************************************************/


	public void setNumeroSemestre(int numeroSemestre) {
		this.numeroSemestre = numeroSemestre;
	}

	public void setNumeroFormation(int numeroFormation) {
		this.numeroFormation = numeroFormation;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
}
