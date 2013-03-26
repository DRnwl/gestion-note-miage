package fr.paris10.miage.gnote.univcmp.bean;



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
