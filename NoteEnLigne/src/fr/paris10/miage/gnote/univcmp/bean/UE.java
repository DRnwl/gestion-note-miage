package fr.paris10.miage.gnote.univcmp.bean;


public class UE {
	/**
	 * Les différents attributs ainsi que leur visibilité
	 */
	private int numeroUE;
	private Semestre semestre;
	private Formation formation;

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

	/***********************************************************************************************************************
	 ****************************************************** LES SETTERS******************************************************
	 ***********************************************************************************************************************/
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
	public String toString() {
		return "UE [numeroUE=" + numeroUE + ", semestre=" + semestre
				+ ", formation=" + formation + "]";
	}

}
