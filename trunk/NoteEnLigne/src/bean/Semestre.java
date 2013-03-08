package bean;

/**
 * Classe représentant le semestre
 * 
 * @author Patrick Kasongo
 * @version 1.0
 * 
 */
public class Semestre {
	/**
	 * Les différents attributs ainsi que leur visibilité
	 */
	private String numeroSemestre;
	private String libelle;

	/**
	 * Conctructeur sans parametre.
	 */

	public Semestre() {
	}

	/**
	 * Le constructeur
	 * 
	 * @param numeroSemestre
	 * @param libelle
	 */

	public Semestre(String numeroSemestre, String libelle) {

		this.numeroSemestre = numeroSemestre;
		this.libelle = libelle;
	}

	/***********************************************************************************************************************
	 ****************************************************** LES GETTERS******************************************************
	 ***********************************************************************************************************************/

	public String getNumeroSemestre() {
		return numeroSemestre;
	}

	public String getLibelle() {
		return libelle;
	}

	/***********************************************************************************************************************
	 ****************************************************** LES SETTERS******************************************************
	 ***********************************************************************************************************************/

	public void setNumeroSemestre(String numeroSemestre) {
		this.numeroSemestre = numeroSemestre;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
