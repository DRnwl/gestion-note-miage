package fr.paris10.miage.gnote.univcmp.bean;

/**
 * Classe représentant l'EU
 * 
 * @author Lydie Tiago
 * @version 1.0
 * 
 */
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

	/**
	 * Le constructeur avec paramètre
	 * 
	 * @param numeroUE
	 * @param numeroSemestre
	 * @param numeroFormation
	 * @param libelle
	 */
	public UE(int numeroUE,int numeroSemestre, int numeroFormation,
			String libelle) {
		
		this.numeroUE = numeroUE;
		this.numeroSemestre = numeroSemestre;
		this.numeroFormation = numeroFormation;
		this.libelle = libelle;
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
