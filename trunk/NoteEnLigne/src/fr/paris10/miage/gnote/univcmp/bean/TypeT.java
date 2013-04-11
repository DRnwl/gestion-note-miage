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



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroType;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		TypeT other = (TypeT) obj;
		if (numeroType != other.numeroType){
			return false;
		}
		return true;
	}



	@Override
	public String toString() {
		return "TypeT [numeroType=" + numeroType + ", libelle=" + libelle + "]";
	}
	
	
	
}
