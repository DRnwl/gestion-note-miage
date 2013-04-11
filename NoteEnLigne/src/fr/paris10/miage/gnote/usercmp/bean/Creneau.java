package fr.paris10.miage.gnote.usercmp.bean;

import java.sql.Date;

import fr.paris10.miage.gnote.univcmp.bean.EC;


public class Creneau {

    /**
     * Clé primaire géré par la base et accessible uniquement en lecture.
     */
    private int idCreneau;
    private static int nextCreneau=0;
    private int numeroEnseignant;
    private int numeroSalle;
    private int numeroFromation;
    private int numeroUE;
    private int numeroEC;
    private int numeroType;
    private Date dateCreneau;
    private String horaire;

    /**
     * Constructeur sans parametre.
     */
    public Creneau() {
    }



    
    public int getIdCreneau() {
		return idCreneau;
	}

	public static int getNextCreneau() {
		return nextCreneau;
	}

	public int getNumeroEnseignant() {
		return numeroEnseignant;
	}

	public void setNumeroEnseignant(int numeroEnseignant) {
		this.numeroEnseignant = numeroEnseignant;
	}

	public int getNumeroSalle() {
		return numeroSalle;
	}

	public void setNumeroSalle(int numeroSalle) {
		this.numeroSalle = numeroSalle;
	}

	public int getNumeroFromation() {
		return numeroFromation;
	}

	public void setNumeroFromation(int numeroFromation) {
		this.numeroFromation = numeroFromation;
	}

	public int getNumeroUE() {
		return numeroUE;
	}

	public void setNumeroUE(int numeroUE) {
		this.numeroUE = numeroUE;
	}

	public int getNumeroEC() {
		return numeroEC;
	}

	public void setNumeroEC(int numeroEC) {
		this.numeroEC = numeroEC;
	}

	public int getNumeroType() {
		return numeroType;
	}

	public void setNumeroType(int numeroType) {
		this.numeroType = numeroType;
	}

	public Date getDateCreneau() {
		return dateCreneau;
	}

	public void setDateCreneau(Date dateCreneau) {
		this.dateCreneau = dateCreneau;
	}

	public String getHoraire() {
		return horaire;
	}

	public void setHoraire(String horaire) {
		this.horaire = horaire;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateCreneau == null) ? 0 : dateCreneau.hashCode());
		result = prime * result + ((horaire == null) ? 0 : horaire.hashCode());
		result = prime * result + idCreneau;
		result = prime * result + numeroEC;
		result = prime * result + numeroEnseignant;
		result = prime * result + numeroFromation;
		result = prime * result + numeroSalle;
		result = prime * result + numeroType;
		result = prime * result + numeroUE;
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
		Creneau other = (Creneau) obj;
		if (dateCreneau == null) {
			if (other.dateCreneau != null){
				return false;
			}
		} else if (!dateCreneau.equals(other.dateCreneau)){
			return false;
		}
		if (horaire == null) {
			if (other.horaire != null){
				return false;
			}
		} else if (!horaire.equals(other.horaire)){
			return false;
		}
		if (idCreneau != other.idCreneau){
			return false;
		}
		if (numeroEC != other.numeroEC){
			return false;
		}
		if (numeroEnseignant != other.numeroEnseignant){
			return false;
		}
		if (numeroFromation != other.numeroFromation){
			
		
			return false;
		}
		if (numeroSalle != other.numeroSalle){
			return false;
		}
		if (numeroType != other.numeroType){
			return false;
		}
		if (numeroUE != other.numeroUE){
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Creneau [idCreneau=" + idCreneau + ", numeroEnseignant="
				+ numeroEnseignant + ", numeroSalle=" + numeroSalle
				+ ", numeroFromation=" + numeroFromation + ", numeroUE="
				+ numeroUE + ", numeroEC=" + numeroEC + ", numeroType="
				+ numeroType + ", dateCreneau=" + dateCreneau + ", horaire="
				+ horaire + "]";
	}
	
	
}
