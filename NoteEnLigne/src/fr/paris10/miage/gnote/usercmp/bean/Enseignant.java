package fr.paris10.miage.gnote.usercmp.bean;

/**
 * Classe représentant un enseignant.
 * @author Lydie Tiago
 * @version 1.1
 *
 */
public class Enseignant {

    /**
     * Clé primaire géré par la base et accessible uniquement en lecture.
     */
    private int numeroEnseignant;
    private static int nextEnseignant=0;
    private int numeroPoste;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String dateNaissance;
    private String login;
    private String pwd;

    /**
     * Constructeur sans parametre.
     */
    public Enseignant() {
    }

    /**
     * Constructeur avec parametres.
     * @param numeroPoste
     * @param nom
     * @param prenom
     * @param adresse
     * @param telephone
     * @param dateNaissance
     * @param login
     * @param pwd
     */
    public Enseignant(String nom, String prenom, String adresse,
            String telephone, String dateNaissance, int numeroPoste, String login, String pwd) {
    	this.numeroEnseignant=this.nextEnseignant++;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.dateNaissance = dateNaissance;
        this.numeroPoste = numeroPoste;
        this.login=login;
        this.pwd=pwd;

    }

    /***********************************************************************************************************************
     ******************************************************LES ACCESSEURS******************************************************
     ***********************************************************************************************************************/
    public int getNumeroEnseignant() {
        return this.numeroEnseignant;
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

    public String getDateNaissance() {
        return this.dateNaissance;
    }
    
    public int getNumeroPoste(){
        return this.numeroPoste;
    }
    
    public String getLogin(){
        return this.login;
    }
    
    public String getPwd(){
        return this.pwd;
    }

    /***********************************************************************************************************************
     ******************************************************SETTERS******************************************************
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

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    
    public void setNumeroPoste(int numeroPoste){
        this.numeroPoste = numeroPoste;
    }
    
    public void setLogin(String login){
        this.login = login;
    }
    
    public void setPwd(String pwd){
        this.pwd = pwd;
    }
    
}
