package fr.paris10.miage.gnote.univcmp.bean;

import java.sql.Date;

/**
 * Classe représentant l'Examen pass� par un étudiant
 * 
 * @author Lydie Tiago
 * @version 1.0
 * 
 */
public class Examen {
	/**
	 * Les différents attributs ainsi que leur visibilité
	 */
	private int numeroExamen;
	private static int nextExamen=0;
	private Date dateExamen;
	private int numeroType;
	private int numeroFormation;
	private int numeroUE;
	private int numeroEC;
	private String libelle;
	private String horaire;
	private float poucentage;

	/**
	 * Conctructeur sans parametre.
	 */

	public Examen() {
	}

	public Examen(int numeroExamen, Date dateExamen, int numeroType,
			int numeroFormation, int numeroUE, int numeroEC, String libelle,
			String horaire, float poucentage) {
		super();
		this.numeroExamen = this.nextExamen++;
		this.dateExamen = dateExamen;
		this.numeroType = numeroType;
		this.numeroFormation = numeroFormation;
		this.numeroUE = numeroUE;
		this.numeroEC = numeroEC;
		this.libelle = libelle;
		this.horaire = horaire;
		this.poucentage = poucentage;
	}
	

	/***********************************************************************************************************************
	 ****************************************************** LES GETTERS/SETTERS******************************************************
	 ***********************************************************************************************************************/


	public int getNumeroExamen() {
		return numeroExamen;
	}


	public static int getNextExamen() {
		return nextExamen;
	}


	public Date getDateExamen() {
		return dateExamen;
	}

	public void setDateExamen(Date dateExamen) {
		this.dateExamen = dateExamen;
	}

	public int getNumeroType() {
		return numeroType;
	}

	public void setNumeroType(int numeroType) {
		this.numeroType = numeroType;
	}

	public int getNumeroFormation() {
		return numeroFormation;
	}

	public void setNumeroFormation(int numeroFormation) {
		this.numeroFormation = numeroFormation;
	}

	public int getNumeroUE() {
		return numeroUE;
	}

	public void setNumeroUE(int numeroUE) {
		this.numeroUE = numeroUE;
	}

	public int getNumeroEC() {
		return numeroEC;
	}

	public void setNumeroEC(int numeroEC) {
		this.numeroEC = numeroEC;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getHoraire() {
		return horaire;
	}

	public void setHoraire(String horaire) {
		this.horaire = horaire;
	}

	public float getPoucentage() {
		return poucentage;
	}

	public void setPoucentage(float poucentage) {
		this.poucentage = poucentage;
	}



}
