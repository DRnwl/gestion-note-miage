package fr.paris10.miage.gnote.univcmp.bean;

import fr.paris10.miage.gnote.usercmp.bean.Contrat_Quadrienal;


public class Formation {

	private int numeroFormation;
	private Contrat_Quadrienal contrat;
	private String libelle;
	private String niveau;
	private String type;
	private String parcours;

	/**
	 * Constructeur sans parametre.
	 */
	public Formation() {
		numeroFormation=0;
		contrat=null;
		libelle="";
		niveau="";
		type="";
		parcours="";

	}

	/**
	 * Constructeur avec parametres.
	 * @param numeroFormation
	 * @param contrat
	 * @param libelle
	 * @param niveau
	 * @param type
	 * @param parcours
	 */
	public Formation(int numeroFormation, Contrat_Quadrienal contrat,
			String libelle, String niveau, String type, String parcours) {
		super();
		this.numeroFormation = numeroFormation;
		this.contrat = contrat;
		this.libelle = libelle;
		this.niveau = niveau;
		this.type = type;
		this.parcours = parcours;
	}

	/***********************************************************************************************************************
	 ******************************************************LES GETTERS/SETTERS******************************************************/


	public int getNumeroFormation() {
		return numeroFormation;
	}

	public void setNumeroFormation(int numeroFormation) {
		this.numeroFormation = numeroFormation;
	}

	public Contrat_Quadrienal getContrat() {
		return contrat;
	}

	public void setContrat(Contrat_Quadrienal contrat) {
		this.contrat = contrat;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getParcours() {
		return parcours;
	}

	public void setParcours(String parcours) {
		this.parcours = parcours;
	}	

	/***********************************************************************************************************************
	 ****************************************************** Affichage******************************************************
	 ***********************************************************************************************************************/
	public String toString(){
		return "<tr><td>" + this.numeroFormation + "</td><td>" + this.contrat + "</td></tr>" 
				+ "</td><td>" + this.libelle + "</td></tr>" 
				+ "</td><td>" + this.niveau + "</td></tr>" 
				+ "</td><td>"+ this.type + "</td></tr>" 
				+ "</td><td>" + this.parcours + "</td></tr>";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroFormation;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		Formation other = (Formation) obj;
		if (numeroFormation != other.numeroFormation){
			return false;
		}
		return true;
	}
 
}