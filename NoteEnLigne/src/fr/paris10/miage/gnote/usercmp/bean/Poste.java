package fr.paris10.miage.gnote.usercmp.bean;


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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + numeroPoste;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Poste other = (Poste) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (numeroPoste != other.numeroPoste)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Poste [type=" + type + ", description=" + description
				+ ", nbreHeure=" + nbreHeure + "]";
	}
    
 
}
