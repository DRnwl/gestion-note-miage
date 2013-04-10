package fr.paris10.miage.gnote.usercmp.bean;

import java.util.ArrayList;
import java.util.List;

import fr.paris10.miage.gnote.univcmp.bean.EC;
import fr.paris10.miage.gnote.univcmp.bean.Formation;
import fr.paris10.miage.gnote.univcmp.bean.Promotion;
import fr.paris10.miage.gnote.univcmp.bean.UE;


public class Enseignant {

    /**
     * Clé primaire géré par la base et accessible uniquement en lecture.
     */
    private int numeroEnseignant;
    private int numeroPoste;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String dateNaissance;
    private String login;
    private String pwd;
    private List<EC>listeEC;
	private List<UE>listeEU;
	private List<Promotion>listePromo;
	private List<Formation>listeForm;
    /**
     * Constructeur sans parametre.
     */
    public Enseignant() {
    	this.numeroEnseignant=0;
        this.nom ="";
        this.prenom ="";
        this.adresse ="";
        this.telephone ="";
        this.dateNaissance ="";
        this.numeroPoste =0;
        this.login="";
        this.pwd="";
        this.listePromo= new ArrayList<Promotion>();
        this.listeForm= new ArrayList<Formation>();
        this.listeEC= new ArrayList<EC>();
        this.listeEU= new ArrayList<UE>();
        
        
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
    public Enseignant(int nnumeroEnseignant,String nom, String prenom, String adresse,
            String telephone, String dateNaissance, int numeroPoste, String login, String pwd) {
    	this.numeroEnseignant=nnumeroEnseignant;
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

	public void setNumeroEnseignant(int numeroEnseignant) {
		this.numeroEnseignant = numeroEnseignant;
	}

	public List<EC> getListeEc() {
		return listeEC;
	}

	public void setListeEc(List<EC> listeEc) {
		this.listeEC = listeEc;
	}

	public List<UE> getListeEU() {
		return listeEU;
	}

	public void setListeEU(List<UE> listeEU) {
		this.listeEU = listeEU;
	}

	public List<Promotion> getListePromo() {
		return listePromo;
	}

	public void setListePromo(List<Promotion> listePromo) {
		this.listePromo = listePromo;
	}

	public List<Formation> getListForm() {
		return listeForm;
	}

	public void setListForm(List<Formation> listForm) {
		this.listeForm = listForm;
	}
    
    
    
}
