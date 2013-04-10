package fr.paris10.miage.gnote.univcmp.bean;


public class UE {
	/**
	 * Les différents attributs ainsi que leur visibilité
	 */
	private int numeroUE;
	private Semestre semestre;
	private Formation formation;
	//private String libelle;

	/**
	 * Conctructeur sans parametre.
	 */

	public UE() {
		numeroUE=0;
		semestre=null;
		formation=null;
	}


	/***********************************************************************************************************************
	 ****************************************************** LES GETTERS******************************************************
	 ***********************************************************************************************************************/

	public int getNumeroUE() {
		return numeroUE;
	}



	public Semestre getSemestre() {
		return semestre;
	}


	public Formation getFormation() {
		return formation;
	}


	/*public String getLibelle() {
		return libelle;
	}*/



	/***********************************************************************************************************************
	 ****************************************************** LES SETTERS******************************************************
	 ***********************************************************************************************************************/

	/*public void setLibelle(String libelle) {
		this.libelle = libelle;
	}*/


	public void setNumeroUE(int numeroUE) {
		this.numeroUE = numeroUE;
	}


	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}


	public void setFormation(Formation formation) {
		this.formation = formation;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((formation == null) ? 0 : formation.hashCode());
		result = prime * result + numeroUE;
		result = prime * result
				+ ((semestre == null) ? 0 : semestre.hashCode());
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
		UE other = (UE) obj;
		if (formation == null) {
			if (other.formation != null)
				return false;
		} else if (!formation.equals(other.formation))
			return false;
		if (numeroUE != other.numeroUE)
			return false;
		if (semestre == null) {
			if (other.semestre != null)
				return false;
		} else if (!semestre.equals(other.semestre))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "UE [numeroUE=" + numeroUE + ", semestre=" + semestre
				+ ", formation=" + formation + "]";
	}

}
