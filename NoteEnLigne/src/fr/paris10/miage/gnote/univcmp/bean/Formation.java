package fr.paris10.miage.gnote.univcmp.bean;


public class Formation {

	private int numeroFormation;
	private static int nextFormation=0;
	private int numeroContrat;
	private String libelle;
	private String niveau;
	private String type;
	private String parcours;

	public Formation() {
	}


	public Formation( int numeroContrat,String libelle, String niveau,
			String type, String parcours) {

		this.numeroFormation = this.nextFormation++;
		this.numeroContrat=numeroContrat;
		this.libelle = libelle;
		this.niveau = niveau;
		this.type = type;
		this.parcours = parcours;

	}

	/***********************************************************************************************************************
	 ****************************************************** LES GETTERS******************************************************
	 ***********************************************************************************************************************/

	public int getNumeroFormation() {
		return numeroFormation;
	}
	
	
	
	public static int getNextFormation() {
		return nextFormation;
	}

	public int getNumeroContrat() {
		return numeroContrat;
	}

	public String getLibelle() {
		return libelle;
	}

	public String getNiveau() {
		return niveau;
	}

	public String getType() {
		return type;
	}

	public String getParcours() {
		return parcours;
	}

	/***********************************************************************************************************************
	 ****************************************************** LES SETTERS******************************************************
	 ***********************************************************************************************************************/

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setParcours(String parcours) {
		this.parcours = parcours;
	}

	public void setNumeroContrat(int numeroContrat) {
		this.numeroContrat = numeroContrat;
	}
	
	

}