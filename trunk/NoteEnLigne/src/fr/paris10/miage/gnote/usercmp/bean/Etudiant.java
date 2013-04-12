package fr.paris10.miage.gnote.usercmp.bean;

import java.util.ArrayList;



import fr.paris10.miage.gnote.univcmp.bean.Examen;
import fr.paris10.miage.gnote.univcmp.bean.Promotion;
import fr.paris10.miage.gnote.univcmp.bean.PromotionEtudiant;
import fr.paris10.miage.gnote.univcmp.bean.ResultatExamen;


public class Etudiant{

    /**
     * Clé primaire géré par la base et accessible uniquement en lecture.
     */
    private int numeroEtudiant;
    private Candidat candidat;                                          
    private String modeEvaluation;   
    private ArrayList<ResultatExamen> listResultatExamen=new ArrayList<ResultatExamen>();
    private ArrayList<PromotionEtudiant> listPromotionEtudiant=new ArrayList<PromotionEtudiant>();

    /**
     * Constructeur sans parametre.
     */
   
    	
    	public Etudiant(){
    	
    	}

    /***********************************************************************************************************************
     ******************************************************LES GETTERS******************************************************
     ***********************************************************************************************************************/
    public int getNumeroEtudiant() {
        return numeroEtudiant;
    }

    public Candidat getCandidat() {
        return this.candidat;
    }

    public String getModeEvaluation() {
        return this.modeEvaluation;
    }
    
    
    public ArrayList<ResultatExamen> getResultatExamen(){
    	return this.listResultatExamen;
    }


	public ArrayList<PromotionEtudiant> getListPromotionEtudiant() {
		return listPromotionEtudiant;
	}


	/***********************************************************************************************************************
     ******************************************************SETTERS******************************************************
     ***********************************************************************************************************************/
    
    
    public void setCandidat(Candidat candidat) {
        this.candidat = candidat;
    }

    public void setNumeroEtudiant(int numeroEtudiant) {
		this.numeroEtudiant = numeroEtudiant;
	}

	public void setModeEvaluation(String modeEvaluation) {
        this.modeEvaluation = modeEvaluation;
    }

    public void setListResultatExamen(ArrayList<ResultatExamen> listNote) {
		this.listResultatExamen = listNote;
	}

	public void setListPromotionEtudiant(
			ArrayList<PromotionEtudiant> listPromotionEtudiant) {
		this.listPromotionEtudiant = listPromotionEtudiant;
	}
/***********************************************************************************************************************
 ******************************************************Add Note******************************************************
 ***********************************************************************************************************************/
    /**
     * Ajouter une note a un Etudiant
     * @param re : the grade
     * @return true si la note a ete ajoutee
     */
    public boolean addResultatExamen(ResultatExamen re) {
        return this.listResultatExamen.add(re);
    }
    
    
    /***********************************************************************************************************************
     ******************************************************Set Note******************************************************
     ***********************************************************************************************************************/
   
    public boolean setResultatExamen(Examen e, double note) {
        boolean result = false;
        for (ResultatExamen re : listResultatExamen) {
            if (re.getExamen().getNumeroExamen() == e.getNumeroExamen()) {
                re.setNote(note);
                result = true;
                break;
            }
        }
        return result;
    }
    
    /***********************************************************************************************************************
     ******************************************************Add Promotion******************************************************
     ***********************************************************************************************************************/
        /**
         * Ajouter une note a un Etudiant
         * @param re : the grade
         * @return true si la note a ete ajoutee
         */
        public boolean addPromotionEtudiant(PromotionEtudiant pe) {
            return this.listPromotionEtudiant.add(pe);
        }
 /***********************************************************************************************************************
     ******************************************************Affichage******************************************************
     ***********************************************************************************************************************/

    public String affResultatExamen() {
	    String s = "<table><tr><td>Numero UE</td><td>Libelle EC</td><td>Libelle Examen</td><td>Pourcentage</td><td>Note</td></tr>";
	    for (ResultatExamen re : listResultatExamen) {
	        s = s + re.toString() ;
	    }
	    s = s + "</table>";
	    return s;
    }
    

    /**
     * Afficher les promotions de l'étudiant
     * @return String sous forme de liste à puce
     */
    public String afficherListPromotion() {
    	String s="<ul>";
    	for(PromotionEtudiant pe: listPromotionEtudiant){
    		s=s+pe.afficherPromotion();
    	}
    	s=s+"</ul>";
    	return s;
    }

	
    
}
