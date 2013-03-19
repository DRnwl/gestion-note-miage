package fr.paris10.miage.gnote.univcmp.bean;

public class Enseignant {

	
	    private int numEnseignant;
    
	    private int  numPost;
	    private String nom ;
	    private String  prenom;
	    private String adresse;
	    private String tel;
	    private String dateNaissance;
	    private String login ;
	    private String pwd ; 
	    
	    public Enseignant (){
	    	
	    }

		public int getNumEnseignant() {
			return numEnseignant;
		}

		public void setNumEnseignant(int numEnseignant) {
			this.numEnseignant = numEnseignant;
		}

		public int getNumPost() {
			return numPost;
		}

		public void setNumPost(int numPost) {
			this.numPost = numPost;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public String getAdresse() {
			return adresse;
		}

		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}

		public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

		public String getDateNaissance() {
			return dateNaissance;
		}

		public void setDateNaissance(String dateNaissance) {
			this.dateNaissance = dateNaissance;
		}

		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
	    
	    
}
