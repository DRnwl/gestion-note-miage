package fr.paris10.miage.gnote.univcmp.actions;

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
			HttpServletRequest request,HttpServletResponse response )throws Exception {
		
		Enseignant ensei= new Enseignant();
		
		int numForm=0;
		CreationExamForm moExamForm =(CreationExamForm) form;
		ServletContext context = getServlet().getServletContext();
		QueryBD conBase = new QueryBD(context.getRealPath(""));
		
		HttpSession session = request.getSession(true);
		ensei= (Enseignant )session.getAttribute("user");
		int pour = Integer.parseInt(moExamForm.getPour());
		String date=moExamForm.getDate();
		int ue=Integer.parseInt(moExamForm.getUe());
		int ec=Integer.parseInt(moExamForm.getEc());
		String forma =moExamForm.getForm();
		int numt=Integer.parseInt(moExamForm.getNumt());
		String heure=moExamForm.getHeure();
		String libelle=moExamForm.getLibExam();
		for (int i=0;i<ensei.getListForm().size();i++){
			if(ensei.getListForm().get(i).getLibelle().equals(forma)){
			numForm= ensei.getListForm().get(i).getNumeroFormation();
			}
		}
		
		int ResulInsert=conBase.InsertExam(date,numt,numForm,ue,ec,heure,libelle,pour);
            if(ResulInsert==0){
            
            
    		return mapping.findForward("erreurinsertion");
    		
            }else{
            	return mapping.findForward("creationExamen");
            }
		
		
		

}
}