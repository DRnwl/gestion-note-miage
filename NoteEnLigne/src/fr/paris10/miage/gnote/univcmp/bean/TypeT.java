package fr.paris10.miage.gnote.univcmp.bean;



public class TypeT {
	/**
	 * Les différents attributs ainsi que leur visibilité
	 */
	private int numeroType;
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
	
	


	public void setNumeroType(int numeroType) {
		this.numeroType = numeroType;
	}



	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	
}
