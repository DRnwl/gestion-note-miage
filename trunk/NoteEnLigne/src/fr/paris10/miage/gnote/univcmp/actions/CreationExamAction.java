package fr.paris10.miage.gnote.univcmp.actions;

import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


import fr.paris10.miage.gnote.univcmp.actionform.CreationExamForm;
import fr.paris10.miage.gnote.univcmp.basedonnees.QueryBD;
import fr.paris10.miage.gnote.usercmp.bean.Enseignant;

public class CreationExamAction extends Action{
	public ActionForward execute( ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response )
			throws SQLException {

		

		int numForm=0;
		int numEc=0;
		
		
		CreationExamForm moExamForm =(CreationExamForm) form;
		ServletContext context = getServlet().getServletContext();
		QueryBD conBase = new QueryBD(context.getRealPath(""));

		HttpSession session = request.getSession(true);
		Enseignant ensei= (Enseignant )session.getAttribute("user");
		int pour = Integer.parseInt(moExamForm.getPour());
		String date=moExamForm.getDate();
		int ue=Integer.parseInt(moExamForm.getUe());
		String  ec =moExamForm.getEc();
		for (int i=0;i<ensei.getListeEc().size();i++){
			if(ensei.getListeEc().get(i).getLibelle().equals(ec)){
				numEc= ensei.getListeEc().get(i).getNumeroEC();
			}
		}
		String forma =moExamForm.getForm();
		int numt=Integer.parseInt(moExamForm.getNumt());
		String heure=moExamForm.getHeure();
		String libelle=moExamForm.getLibExam();
		
		for (int i=0;i<ensei.getListForm().size();i++){
			if(ensei.getListForm().get(i).getLibelle().equals(forma)){
				numForm= ensei.getListForm().get(i).getNumeroFormation();
			}
		}

		int resulInsert=conBase.insertExam(date,numt,numForm,ue,numEc,heure,libelle,pour);
		if(resulInsert==0){
   

			return mapping.findForward("erreurinsertion");

		}else{
			return mapping.findForward("creationExamen");
		}




	}
}