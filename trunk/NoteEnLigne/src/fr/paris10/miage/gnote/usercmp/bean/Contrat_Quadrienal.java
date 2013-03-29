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
	
	
	
}
