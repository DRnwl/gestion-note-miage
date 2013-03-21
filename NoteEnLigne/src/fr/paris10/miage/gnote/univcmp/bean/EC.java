package fr.paris10.miage.gnote.univcmp.bean;

	

public class EC {
	/**
	 * Les différents attributs ainsi que leur visibilité
	 */
	private int numeroEC;
	private int numeroFormation;
	private int numeroUE;
	private String libelle;
	private float coef;

	/**
	 * Conctructeur sans parametre.
	 */

	public EC() {
	}

	/**
	 * Le constructeur avec param�tres
	 * @param numeroEC
	 * @param numeroUE
	 * @param numeroFormation
	 * @param libelle
	 * @param coef
	 */
	public EC(int numeroEC, int numeroFormation, int numeroUE, String libelle,
			float coef) {
		super();
		this.numeroEC = numeroEC;
		this.numeroFormation = numeroFormation;
		this.numeroUE = numeroUE;
		this.libelle = libelle;
		this.coef = coef;
	}
	
	/***********************************************************************************************************************
	 ****************************************************** LES GETTERS/SETTERS******************************************************
	 ***********************************************************************************************************************/

	


	public int getNumeroEC() {
		return numeroEC;
	}

	public void setNumeroEC(int numeroEC) {
		this.numeroEC = numeroEC;
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

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public float getCoef() {
		return coef;
	}

	public void setCoef(float coef) {
		this.coef = coef;
	}


}
