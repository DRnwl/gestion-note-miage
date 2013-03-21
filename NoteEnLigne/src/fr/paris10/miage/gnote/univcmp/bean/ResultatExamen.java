package fr.paris10.miage.gnote.univcmp.bean;

/**
 * Classe rep�sentant le resultat d'examen pass� par un �tudiant
 * Correspond � la table A_PASSE de la BDD * 
 * @author Lydie Tiago
 * @version 1.0
 * 
 */
public class ResultatExamen {

	/**
	 * Les diff�rents attributs ainsi que leur visibilit�
	 */
	private int numeroExamen;
	private int numeroEtudiant;
	private float note;

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

	public ResultatExamen(int numeroExamen, int numeroEtudiant, float note) {
		super();
		this.numeroExamen = numeroExamen;
		this.numeroEtudiant = numeroEtudiant;
		this.note = note;
	}

	/***********************************************************************************************************************
	 ****************************************************** LES GETTERS******************************************************
	 ***********************************************************************************************************************/

	public int getNumeroExamen() {
		return numeroExamen;
	}


	public int getNumeroEtudiant() {
		return numeroEtudiant;
	}

	public float getNote() {
		return note;
	}
	

	/***********************************************************************************************************************
	 ****************************************************** LES SETTERS******************************************************
	 ***********************************************************************************************************************/

	public void setNumeroExamen(int numeroExamen) {
		this.numeroExamen = numeroExamen;
	}

	public void setNumeroEtudiant(int numeroEtudiant) {
		this.numeroEtudiant = numeroEtudiant;
	}

	public void setNote(float note) {
		this.note = note;
	}

}
