package bean;

/**
 * Classe représentant l'EU
 * 
 * @author Patrick Kasongo
 * @version 1.0
 * 
 */
public class UE {
	/**
	 * Les différents attributs ainsi que leur visibilité
	 */
	private String numeroUE;
	private String numeroSemestre;
	private String numeroFormation;
	private String libelle;

	/**
	 * Conctructeur sans parametre.
	 */

	public UE() {
	}

	/**
	 * Le constructeur avec paramètre
	 * 
	 * @param numeroUE
	 * @param numeroSemestre
	 * @param numeroFormation
	 * @param libelle
	 */
	public UE(String numeroUE, String numeroSemestre, String numeroFormation,
			String libelle) {

		this.numeroUE = numeroUE;
		this.numeroSemestre = numeroSemestre;
		this.numeroFormation = numeroFormation;
		this.libelle = libelle;
	}

	/***********************************************************************************************************************
	 ****************************************************** LES GETTERS******************************************************
	 ***********************************************************************************************************************/

	public String getNumeroUE() {
		return numeroUE;
	}

	public String getNumeroSemestre() {
		return numeroSemestre;
	}

	public String getNumeroFormation() {
		return numeroFormation;
	}

	public String getLibelle() {
		return libelle;
	}

	/***********************************************************************************************************************
	 ****************************************************** LES SETTERS******************************************************
	 ***********************************************************************************************************************/

	public void setNumeroUE(String numeroUE) {
		this.numeroUE = numeroUE;
	}

	public void setNumeroSemestre(String numeroSemestre) {
		this.numeroSemestre = numeroSemestre;
	}

	public void setNumeroFormation(String numeroFormation) {
		this.numeroFormation = numeroFormation;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
}
