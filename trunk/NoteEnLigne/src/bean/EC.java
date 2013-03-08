package bean;

	

public class EC {
	/**
	 * Les différents attributs ainsi que leur visibilité
	 */
	private String codeEC;
	private String libelle;
	private float credit;

	/**
	 * Conctructeur sans parametre.
	 */

	public EC() {
	}

	/**
	 * Le constructeur avec param�tres
	 * 
	 * @param libelle
	 * @param credit
	 */
	public EC(String codeEC, String libelle, float credit) {

		this.codeEC = codeEC;
		this.libelle = libelle;
		this.credit = credit;
	}

	/***********************************************************************************************************************
	 ****************************************************** LES GETTERS******************************************************
	 ***********************************************************************************************************************/

	public String getCodeEC() {
		return codeEC;
	}

	public String getLibelle() {
		return libelle;
	}

	public float getCredit() {
		return credit;
	}

	/***********************************************************************************************************************
	 ****************************************************** LES SETTERS******************************************************
	 ***********************************************************************************************************************/

	public void setCodeEC(String codeEC) {
		this.codeEC = codeEC;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public void setCredit(float credit) {
		this.credit = credit;
	}

}
