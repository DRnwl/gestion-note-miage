package fr.paris10.miage.gnote.usercmp.bean;

import java.util.Date;

public class Candidat {

    /**
     * 
     */
    private int numeroCandidat;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private Date dateNaissance;
    private String login;
    private String password;
    private Date date;
    private String etatDossier;
    private String email;


    /**
     * Constructeur sans parametre.
     */
    public Candidat() {
    }

  
  

    /***********************************************************************************************************************
     ******************************************************LES GETTERS******************************************************
     ***********************************************************************************************************************/
    public int getNumeroCandidat() {
        return this.numeroCandidat;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public Date getDateNaissance() {
        return (Date) dateNaissance.clone();
    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }

    public Date getDate() {
        return this.date;
    }

    public String getEtatDossier() {
        return this.etatDossier;
    }

    public String getEmail() {
        return this.email;
    }


    /***********************************************************************************************************************
     ******************************************************LES SETTERS******************************************************
     ***********************************************************************************************************************/
    public void setNumeroCandidat(int numeroCandidat){
    	this.numeroCandidat=numeroCandidat;
    }
   
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = (Date) dateNaissance.clone();
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setEtatDossier(String etatDossier) {
        this.etatDossier = etatDossier;
    }

    public void setEmail(String email) {
        this.email = email;
    }



	@Override
	public String toString() {
		return "Candidat [nom=" + nom + ", prenom=" + prenom + ", adresse="
				+ adresse + ", telephone=" + telephone + ", dateNaissance="
				+ dateNaissance + ", date=" + date + ", etatDossier="
				+ etatDossier + ", email=" + email + "]";
	}
    
}
