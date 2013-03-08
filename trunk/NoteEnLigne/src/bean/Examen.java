package bean;

/**
 * Classe représentant l'Examen pass� par un étudiant
 * 
 * @author Patrick Kasongo
 * @version 1.0
 * 
 */
public class Examen {
	/**
	 * Les différents attributs ainsi que leur visibilité
	 */
	private String numeroExamen;
	private String CodeEC;
	private String libelle;
	private String date;
	private String heure;
	private float ratioEC;
	private String typeExamen;
	private String annee;

	/**
	 * Conctructeur sans parametre.
	 */

	public Examen() {
	}

	/**
	 * Le constructeur avec param�tres
	 * 
	 * @param numeroExamen
	 * @param CodeEC
	 * @param libelle
	 * @param date
	 * @param heure
	 * @param ratioEC
	 * @param typeExamen
	 */

	public Examen(String numeroExamen, String CodeEC, String libelle, String date,
			String heure, float ratioEC, String typeExamen) {

		this.numeroExamen = numeroExamen;
		this.CodeEC = CodeEC;
		this.libelle = libelle;
		this.date = date;
		this.heure = heure;
		this.ratioEC = ratioEC;
		this.typeExamen = typeExamen;

	}

	/***********************************************************************************************************************
	 ****************************************************** LES GETTERS******************************************************
	 ***********************************************************************************************************************/

	public String getNumeroExamen() {
		return numeroExamen;
	}

	public String getCodeEC() {
		return CodeEC;
	}
	
	public String getLibelle() {
		return libelle;
	}

	public String getDate() {
		return date;
	}

	public String getHeure() {
		return heure;
	}

	public float getRatioEC() {
		return ratioEC;
	}

	public String getTypeExamen() {
		return typeExamen;
	}

	/***********************************************************************************************************************
	 ****************************************************** LES SETTERS******************************************************
	 ***********************************************************************************************************************/

	public void setNumeroExamen(String numeroExamen) {
		this.numeroExamen = numeroExamen;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	public void setRatioEC(float ratioEC) {
		this.ratioEC = ratioEC;
	}

	public void setTypeExamen(String typeExamen) {
		this.typeExamen = typeExamen;
	}

	public void setCodeEC(String codeEC) {
		CodeEC = codeEC;
	}

	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

}
