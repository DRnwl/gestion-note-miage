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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroSemestre;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Semestre other = (Semestre) obj;
		if (numeroSemestre != other.numeroSemestre)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Semestre [numeroSemestre=" + numeroSemestre + ", libelle="
				+ libelle + "]";
	}
	

}
