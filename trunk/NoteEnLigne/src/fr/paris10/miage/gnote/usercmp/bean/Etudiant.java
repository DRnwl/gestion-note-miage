package fr.paris10.miage.gnote.usercmp.bean;

import fr.paris10.miage.gnote.univcmp.bean.Promotion;

/**
 * Classe représentant un étudiant. 
 * Dans cette version ont été rajouté les attributs id
 * @author Lydie Tiago
 * @version 1.1
 *
 */
public class Etudiant {

    /**
     * Clé primaire géré par la base et accessible uniquement en lecture.
     */
    private int numeroEtudiant;
    private static int nextEtudiant=0;
    private int numeroCandidat;                                          
    private String modeEvaluation;                                        

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
    public Etudiant(int numeroCandidat, String modeEvaluation) {
        this.numeroEtudiant=this.nextEtudiant++;
    	this.numeroCandidat = numeroCandidat;
        this.modeEvaluation = modeEvaluation;
    }

    /***********************************************************************************************************************
     ******************************************************LES ACCESSEURS******************************************************
     ***********************************************************************************************************************/
    public int getNumeroEtudiant() {
        return numeroEtudiant;
    }

    public int getNumeroCandidat() {
        return this.numeroCandidat;
    }

    public String getModeEvaluation() {
        return this.modeEvaluation;
    }

    /***********************************************************************************************************************
     ******************************************************SETTERS******************************************************
     ***********************************************************************************************************************/
    
    public void setNumeroCandidat(int numeroCandidat) {
        this.numeroCandidat = numeroCandidat;
    }

    public void setModeEvaluation(String modeEvaluation) {
        this.modeEvaluation = modeEvaluation;
    }
}
