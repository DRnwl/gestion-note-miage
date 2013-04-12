package fr.paris10.miage.gnote.univcmp.bean;

import java.sql.Date;



public class Examen {
	/**
	 * Les différents attributs ainsi que leur visibilité
	 */
	private int numeroExamen;
	private static int nextExamen=0;
	private Date dateExamen;
	private TypeT type;
	private Formation formation;
	private UE ue;
	private EC ec;
	private String libelle;
	private String horaire;
	private float poucentage;



	/**
	 * Conctructeur sans parametre.
	 */

	public Examen() {
	}


	/**
	 * Constructeur avec parametres.
	 * @param dateExamen
	 * @param type
	 * @param formation
	 * @param ue
	 * @param ec
	 * @param libelle
	 * @param horaire
	 * @param poucentage
	 */

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
		return (Date) dateExamen.clone();
	}


	public void setDateExamen(Date dateExamen) {
		this.dateExamen = (Date) dateExamen.clone();
	}


	public TypeT getType() {
		return type;
	}


	public void setType(TypeT type) {
		this.type = type;
	}


	public Formation getFormation() {
		return formation;
	}


	public void setFormation(Formation formation) {
		this.formation = formation;
	}


	public UE getUe() {
		return ue;
	}


	public void setUe(UE ue) {
		this.ue = ue;
	}


	public EC getEc() {
		return ec;
	}


	public void setEc(EC ec) {
		this.ec = ec;
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
