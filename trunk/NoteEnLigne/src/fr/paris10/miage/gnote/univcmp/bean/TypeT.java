package fr.paris10.miage.gnote.univcmp.bean;

/**
 * Classe representant le type
 * 
 * @author Lydie Tiago
 * @version 1.0
 * 
 */

public class TypeT {
	/**
	 * Les différents attributs ainsi que leur visibilité
	 */
	private int numeroType;
	private static int nextType=0;
	private String libelle;

	/**
	 * Conctructeur sans parametre.
	 */

	public TypeT() {
	}

	
	/**
	 * Le constructeur
	 * 
	 * @param libelle
	 */
	public TypeT(String libelle) {
		this.numeroType=this.nextType++;
		this.libelle = libelle;
	}

	/***********************************************************************************************************************
	 ****************************************************** LES GETTERS/SETTERS******************************************************
	 ***********************************************************************************************************************/

	public int getNumeroType() {
		return numeroType;
	}

	public static int getNextType() {
		return nextType;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	
}
