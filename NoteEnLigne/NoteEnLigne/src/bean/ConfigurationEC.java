package bean;


public class ConfigurationEC {
	/**
	 * Les diff�rents attributs ainsi que leur visibilit�
	 */
	private int nombreExamen;
	private String numeroConfiguration;
	private String codeEC;
	private String annee;

	/**
	 * Conctructeur sans parametre.
	 */

	public ConfigurationEC() {
	}

	/**
	 * Le constructeur avec param�tres
	 * 
	 * @param nombreExamen
	 */
	public ConfigurationEC(String numeroConfiguration, String codeEC, int nombreExamen) {
		this.setNumeroConfiguration(numeroConfiguration);
		this.setCodeEC(codeEC);
		this.nombreExamen = nombreExamen;
	}

	/***********************************************************************************************************************
	 ****************************************************** LES GETTERS******************************************************
	 ***********************************************************************************************************************/
	public String getNumeroConfiguration() {
		return numeroConfiguration;
	}
	public String getCodeEC() {
		return codeEC;
	}
	public int getNombreExamen() {
		return nombreExamen;
	}

	/***********************************************************************************************************************
	 ****************************************************** LES SETTERS******************************************************
	 ***********************************************************************************************************************/

	public void setNombreExamen(int nombreExamen) {
		this.nombreExamen = nombreExamen;
	}
	public void setNumeroConfiguration(String numeroConfiguration) {
		this.numeroConfiguration = numeroConfiguration;
	}
	public void setCodeEC(String codeEC) {
		this.codeEC = codeEC;
	}

	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

}
