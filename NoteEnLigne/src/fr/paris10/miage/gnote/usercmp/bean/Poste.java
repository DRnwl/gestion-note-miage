package fr.paris10.miage.gnote.usercmp.bean;


public class Poste {

    /**
     * Clé primaire géré par la base et accessible uniquement en lecture.
     */
    private int numeroPoste;
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
    public Poste(int numeroPoste,String type, String description, String nbrHeure) {
        this.numeroPoste=numeroPoste;
    	this.type = type;
        this.description = description;
        this.nbreHeure = nbrHeure;
    }

   


	public int getNumeroPoste() {
		return numeroPoste;
	}

	public void setNumeroPoste(int numeroPoste) {
		this.numeroPoste = numeroPoste;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNbreHeure() {
		return nbreHeure;
	}

	public void setNbreHeure(String nbreHeure) {
		this.nbreHeure = nbreHeure;
	}

	@Override
	public String toString() {
		return "Poste [type=" + type + ", description=" + description
				+ ", nbreHeure=" + nbreHeure + "]";
	}
    
 
}
