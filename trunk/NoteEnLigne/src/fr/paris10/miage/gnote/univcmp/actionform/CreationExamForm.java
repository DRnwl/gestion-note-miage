package fr.paris10.miage.gnote.univcmp.actionform;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
/***** ceci est le form associé a la jsp creationExamen******/
public class CreationExamForm extends ActionForm  {
	private String pour="";
	private String date="";
	private String ue="";
	private String ec="";
	private String form="";
	private String numt="";
	private  String heure="";
	private String libExam="";


	public String getLibExam() {
		return libExam;
	}


	public void setLibExam(String libExam) {
		this.libExam = libExam;
	}


	public String getPour() {
		return pour;
	}


	public void setPour(String pour) {
		this.pour = pour;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getUe() {
		return ue;
	}


	public void setUe(String ue) {
		this.ue = ue;
	}


	public String getEc() {
		return ec;
	}


	public void setEc(String ec) {
		this.ec = ec;
	}


	public String getForm() {
		return form;
	}


	public void setForm(String form) {
		this.form = form;
	}


	public String getNumt() {
		return numt;
	}


	public void setNumt(String numt) {
		this.numt = numt;
	}


	public String getHeure() {
		return heure;
	}


	public void setHeure(String heure) {
		this.heure = heure;
	}


	public ActionErrors validate( ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if(pour.isEmpty()||date.isEmpty()||ue.isEmpty()){
			errors.add("",new ActionMessage(""));
		}else{
        if(ec.isEmpty()||form.isEmpty()||numt.isEmpty()||heure.isEmpty()){
        	errors.add("",new ActionMessage(""));
        }
		}

		return errors;
	}


}
