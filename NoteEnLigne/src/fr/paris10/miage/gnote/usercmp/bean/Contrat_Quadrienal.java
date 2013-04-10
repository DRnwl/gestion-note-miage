package fr.paris10.miage.gnote.usercmp.bean;

import java.sql.Date;


public class Contrat_Quadrienal {
	/**
	 * Les différents attributs ainsi que leur visibilité
	 */
	private int numeroContrat;
	private Date dateContrat;
	private float duree;
	
	/**
     * Constructeur sans parametre.
     */
	
	public Contrat_Quadrienal() {
		// TODO Auto-generated constructor stub
	}

	/**
     * Constructeur avec parametres.
     * @param numeroContrat
     * @param duree
     * @param date
     */
	
	public Contrat_Quadrienal(int numeroContrat,Date dateContrat, float duree) {
		this.numeroContrat=numeroContrat;
		this.dateContrat = dateContrat;
		this.duree = duree;
	}

	/***********************************************************************************************************************
     ******************************************************LES GETTERS/SETTERS******************************************************/
   
	public int getNumeroContrat() {
		return numeroContrat;
	}

	public void setNumeroContrat(int numeroContrat) {
		this.numeroContrat = numeroContrat;
	}

	public Date getDateContrat() {
		return dateContrat;
	}

	public void setDateContrat(Date dateContrat) {
		this.dateContrat = dateContrat;
	}

	public float getDuree() {
		return duree;
	}

	public void setDuree(float duree) {
		this.duree = duree;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroContrat;
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
		Contrat_Quadrienal other = (Contrat_Quadrienal) obj;
		if (numeroContrat != other.numeroContrat)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contrat_Quadrienal [numeroContrat=" + numeroContrat
				+ ", dateContrat=" + dateContrat + ", duree=" + duree + "]";
	}
	
	
	
}
