package fr.paris10.miage.gnote.usercmp.bean;

/**
 * Classe représentant un enseignant.
 * @author Lydie Tiago
 * @version 1.0
 */
public class Poste {

    /**
     * Clé primaire géré par la base et accessible uniquement en lecture.
     */
    private int numeroPoste;
    private static int nextPoste=0;
    private String type;
    private String description;
    private String nbreHeure;

    /**
     * Constructeur sans parametre
     */
    public Poste() {
    }

    /*
     * Constructeur avec parametres.
     */
    public Poste(String type, String description, String nbrHeure) {
        this.numeroPoste=this.nextPoste++;
    	this.type = type;
        this.description = description;
        this.nbreHeure = nbrHeure;
    }

    public int getNumeroPoste() {
        return this.numeroPoste;
    }

    public String getType() {
        return this.type;
    }

    public String getDescription() {
        return this.description;
    }

    public String getNbreHeure() {
        return this.nbreHeure;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNbreHeure(String nbreHeure) {
        this.nbreHeure = nbreHeure;
    }
    
 
}
