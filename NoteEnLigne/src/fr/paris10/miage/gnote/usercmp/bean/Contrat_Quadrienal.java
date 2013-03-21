package fr.paris10.miage.gnote.usercmp.bean;

import java.sql.Date;

/**
 * @author Lydie Tiago
 * @version 1.0
 */

public class Contrat_Quadrienal {
	private int numeroContrat;
	private static int nextContrat=0;
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
     * @param duree
     * @param date
     */
	
	public Contrat_Quadrienal(Date dateContrat, float duree) {
		this.numeroContrat=this.nextContrat++;
		this.dateContrat = dateContrat;
		this.duree = duree;
	}
	
	/***********************************************************************************************************************
     ******************************************************LES GETTERS/SETTERS******************************************************/
    

	public int getNumeroContrat() {
		return numeroContrat;
	}

	public static int getNextContrat() {
		return nextContrat;
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
