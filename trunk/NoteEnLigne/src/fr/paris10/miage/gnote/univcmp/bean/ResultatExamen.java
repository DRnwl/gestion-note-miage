package fr.paris10.miage.gnote.univcmp.bean;

import fr.paris10.miage.gnote.usercmp.bean.Etudiant;

/**
 * correspond à la table A_PASSE de la BDD
 */

public class ResultatExamen {

	/**
	 * Les diff�rents attributs ainsi que leur visibilit�
	 */
	private Examen examen;
	private Etudiant etudiant;
	private double note;

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

	public ResultatExamen(Examen examen, Etudiant etudiant, double note) {
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

	public double getNote() {
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

	public void setNote(double note) {
		this.note = note;
	}
	
	/***********************************************************************************************************************
	 ****************************************************** Affichage******************************************************
	 ***********************************************************************************************************************/
	
	@Override
    public String toString() {
        return "<tr><td>" + this.examen.getUe().getNumeroUE() + "</td><td>" + this.examen.getEc().getLibelle() + "</td><td>" + this.examen.getLibelle() + "</td><td>" + this.examen.getPoucentage() + "</td><td>" + this.note + "</td></tr>";
    }

}
