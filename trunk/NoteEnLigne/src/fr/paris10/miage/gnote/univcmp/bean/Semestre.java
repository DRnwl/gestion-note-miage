package fr.paris10.miage.gnote.univcmp.bean;

public class Semestre {
	/**
	 * Les différents attributs ainsi que leur visibilité
	 */
	private int numeroSemestre;
	private String libelle;

	/**
	 * Conctructeur sans parametre.
	 */

	public Semestre() {
	}


	/***********************************************************************************************************************
	 ****************************************************** LES GETTERS******************************************************
	 ***********************************************************************************************************************/

	public int getNumeroSemestre() {
		return numeroSemestre;
	}

	public String getLibelle() {
		return libelle;
	}
	


	/***********************************************************************************************************************
	 ****************************************************** LES SETTERS******************************************************
	 ***********************************************************************************************************************/


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public void setNumeroSemestre(int numeroSemestre) {
		this.numeroSemestre = numeroSemestre;
	}
	

}
