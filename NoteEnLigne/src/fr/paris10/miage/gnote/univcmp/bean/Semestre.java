package fr.paris10.miage.gnote.univcmp.bean;

public class Semestre {
	/**
	 * Les différents attributs ainsi que leur visibilité
	 */
	private int numeroSemestre;
	private static int nextSemestre=0;
	private String libelle;

	/**
	 * Conctructeur sans parametre.
	 */

	public Semestre() {
	}

	/**
	 * Le constructeur
	 * 
	 * @param libelle
	 */

	public Semestre(String libelle) {

		this.numeroSemestre = this.nextSemestre++;
		this.libelle = libelle;
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
	
	

	public static int getNextSemestre() {
		return nextSemestre;
	}

	/***********************************************************************************************************************
	 ****************************************************** LES SETTERS******************************************************
	 ***********************************************************************************************************************/


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
