package fr.paris10.miage.gnote.univcmp.bean;

/**
 * Classe repésentant au resultat d'examen passé par un étudiant
 * 
 * @author Patrick Kasongo
 * @version 1.0
 * 
 */
public class ResultatExamen {

	/**
	 * Les différents attributs ainsi que leur visibilité
	 */
	private String numeroExamen;
	private String numeroEtudiant;
	private float note;
	private String libelleEC;
	private float ratio;
	private String typeExamen;
	private int numeroEC;
	private float noteFinale;

	/**
	 * Conctructeur sans parametre.
	 */

	public ResultatExamen() {
	}

	/**
	 * Le constructeur
	 * 
	 * @param numeroExamen
	 * @param numeroEtudiant
	 * @param note
	 */

	public ResultatExamen(String numeroExamen, String numeroEtudiant,float note, String libelleEC) {

		this.numeroExamen = numeroExamen;
		this.numeroEtudiant = numeroEtudiant;
		this.note = note;
		this.libelleEC = libelleEC;

	}

	/***********************************************************************************************************************
	 ****************************************************** LES GETTERS******************************************************
	 ***********************************************************************************************************************/

	public String getNumeroExamen() {
		return numeroExamen;
	}

	public String getNumeroEtudiant() {
		return numeroEtudiant;
	}

	public float getNote() {
		return note;
	}
	
	public String getLibelleEC() {
		return libelleEC;
	}

	/***********************************************************************************************************************
	 ****************************************************** LES SETTERS******************************************************
	 ***********************************************************************************************************************/

	public void setNumeroExamen(String numeroExamen) {
		this.numeroExamen = numeroExamen;
	}

	public void setNumeroEtudiant(String numeroEtudiant) {
		this.numeroEtudiant = numeroEtudiant;
	}

	public void setNote(float note) {
		this.note = note;
	}

	public void setLibelleEC(String libelleEC) {
		this.libelleEC = libelleEC;
	}

	public String getTypeExamen() {
		return typeExamen;
	}

	public void setTypeExamen(String typeExamen) {
		this.typeExamen = typeExamen;
	}

	public float getRatio() {
		return ratio;
	}

	public void setRatio(float ratio) {
		this.ratio = ratio;
	}

	public int getNumeroEC() {
		return numeroEC;
	}

	public void setNumeroEC(int numeroEC) {
		this.numeroEC = numeroEC;
	}

	public float getNoteFinale() {
		return noteFinale;
	}

	public void setNoteFinale(float noteFinale) {
		this.noteFinale = noteFinale;
	}
}
