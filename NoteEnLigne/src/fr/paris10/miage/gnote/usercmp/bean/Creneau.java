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

    /**
     * Constructeur avec parametres.
     * @param numeroEnseignant
     * @param numeroEC
     */
    public Creneau(int idCreneau, int numeroEnseignant, int numeroSalle,
			int numeroFromation, int numeroUE, int numeroEC, int numeroType,
			Date dateCreneau, String horaire) {
		super();
		this.idCreneau = this.nextCreneau++;
		this.numeroEnseignant = numeroEnseignant;
		this.numeroSalle = numeroSalle;
		this.numeroFromation = numeroFromation;
		this.numeroUE = numeroUE;
		this.numeroEC = numeroEC;
		this.numeroType = numeroType;
		this.dateCreneau = dateCreneau;
		this.horaire = horaire;
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
}
