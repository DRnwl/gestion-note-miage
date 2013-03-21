package fr.paris10.miage.gnote.univcmp.bean;

/**
 * Classe représentant le semestre
 * 
 * @author Lydie Tiago
 * @version 1.0
 * 
 */
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
