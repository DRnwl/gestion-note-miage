package fr.paris10.miage.gnote.univcmp.actions;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import fr.paris10.miage.gnote.univcmp.actionform.ModifierEcForm;
import fr.paris10.miage.gnote.univcmp.basedonnees.QueryBD;
import fr.paris10.miage.gnote.usercmp.bean.Enseignant;


public class ModifierEcAction extends Action{
	public ActionForward execute( ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response )throws SQLException {

		ModifierEcForm monForm =(ModifierEcForm) form;
		ServletContext context = getServlet().getServletContext();
		QueryBD conBase = new QueryBD(context.getRealPath(""));
		
		//recupération du numéro de formation
		int numeroFormation=Integer.parseInt(monForm.getChoix());
		
		//ici récupération de l'étudiant de la session 
		HttpSession session = request.getSession(true);
		Enseignant ens=(Enseignant) session.getAttribute("user");
		ens.getListeECFormation().clear();
		conBase.affectListECFormation(ens, numeroFormation);
		return mapping.findForward("modifEc");

	}
}
