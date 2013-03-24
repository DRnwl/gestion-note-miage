package fr.paris10.miage.gnote.usercmp.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Date;


import fr.paris10.miage.gnote.univcmp.bean.Examen;
import fr.paris10.miage.gnote.univcmp.bean.Promotion;
import fr.paris10.miage.gnote.univcmp.bean.PromotionEtudiant;
import fr.paris10.miage.gnote.univcmp.bean.ResultatExamen;

/**
 * Classe représentant un étudiant. 
 * Dans cette version ont été rajouté les attributs id
 * @author Lydie Tiago
 * @version 1.1
 *
 */
public class Etudiant{

    /**
     * Clé primaire géré par la base et accessible uniquement en lecture.
     */
    private int numeroEtudiant;
    private Candidat candidat;                                          
    private String modeEvaluation;   
    private ArrayList<ResultatExamen> listResultatExamen;
    private ArrayList<PromotionEtudiant> listPromotionEtudiant;

    /**
     * Constructeur sans parametre.
     */
    public Etudiant() {
    	
    }

    /**
     * Constructeur avec parametres.
     * @param nom
     * @param numeroEtudiant
     * @param promtion
     */
    public Etudiant(int numeroEtudiant,Candidat candidat, String modeEvaluation) {
    	this.listResultatExamen = new ArrayList<ResultatExamen>();
    	this.numeroEtudiant=this.numeroEtudiant;
    	this.candidat = candidat;
        this.modeEvaluation = modeEvaluation;
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


	/***********************************************************************************************************************
     ******************************************************SETTERS******************************************************
     ***********************************************************************************************************************/
    
    public void setCandidat(Candidat candidat) {
        this.candidat = candidat;
    }

    public void setModeEvaluation(String modeEvaluation) {
        this.modeEvaluation = modeEvaluation;
    }

    public void setListResultatExamen(ArrayList<ResultatExamen> listNote) {
		this.listResultatExamen = listNote;
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
     ******************************************************Affichage******************************************************
     ***********************************************************************************************************************/

    @Override
    public String toString() {
	    String s = "<table><tr><td>Libelle Examen</td><td>Note</td></tr>";
	    for (ResultatExamen re : listResultatExamen) {
	        s = s + re.toString() ;
	    }
	    s = s + "</table>";
	    return s;
    }
}
