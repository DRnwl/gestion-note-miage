package fr.paris10.miage.gnote.usercmp.bean;

import java.util.Date;

/**
 * Encapsule  les utilisateurs du système.
 * @author Lydie Tiago
 * @version 1.0
 */
public class Candidat {

    /**
     * 
     */
    private int numeroCandidat;
    private static int nextCandidat=0;
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

    /**
     * Constructeur avec parametres.
     * @param nom
     * @param prenom
     * @param adresse
     * @param telephone
     * @param login
     * @param email
     * @param dateNaissance
     * @param password
     * @param etatDossier
     * @param date
     */
    public Candidat(String nom, String prenom, String adresse, String telephone, Date dateNaissance, String login, String password, 
            Date date, String etatDossier, String email) {
    	this.numeroCandidat= this.nextCandidat++;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.dateNaissance = dateNaissance;
        this.login = login;
        this.password = password;
        this.date = date;
        this.etatDossier = etatDossier;
        this.email = email;

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
        return this.dateNaissance;
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
        this.dateNaissance = dateNaissance;
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
}
