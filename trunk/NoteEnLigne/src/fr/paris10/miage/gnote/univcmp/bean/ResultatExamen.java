package fr.paris10.miage.gnote.univcmp.bean;

import fr.paris10.miage.gnote.usercmp.bean.Etudiant;

/**
 * Classe repésentant le resultat d'examen passé par un étudiant
 * Correspond à la table A_PASSE de la BDD * 
 * @author Lydie Tiago
 * @version 1.0
 * 
 */
public class ResultatExamen {

	/**
	 * Les différents attributs ainsi que leur visibilité
	 */
	private Examen examen;
	private Etudiant etudiant;
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

	public ResultatExamen(Examen examen, Etudiant etudiant, float note) {
		super();
		this.examen = examen;
		this.etudiant = etudiant;
		this.note = note;
	}

	/***********************************************************************************************************************
	 ****************************************************** LES GETTERS******************************************************
	 ***********************************************************************************************************************/

	public Examen getExamen() {
		return this.examen;
	}


	public Etudiant getEtudiant() {
		return this.etudiant;
	}

	public float getNote() {
		return this.note;
	}
	

	/***********************************************************************************************************************
	 ****************************************************** LES SETTERS******************************************************
	 ***********************************************************************************************************************/

	public void setExamen(Examen examen) {
		this.examen = examen;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public void setNote(float note) {
		this.note = note;
	}
	
	/***********************************************************************************************************************
	 ****************************************************** Affichage******************************************************
	 ***********************************************************************************************************************/
	
	@Override
    public String toString() {
        return "<tr><td>" + this.examen.getLibelle() + "</td><td>" + this.note + "</td></tr>";
    }

}
