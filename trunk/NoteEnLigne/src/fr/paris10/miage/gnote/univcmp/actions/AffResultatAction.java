package fr.paris10.miage.gnote.univcmp.actions;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import fr.paris10.miage.gnote.univcmp.actionform.AffResultatForm;
import fr.paris10.miage.gnote.univcmp.basedonnees.QueryBD;
import fr.paris10.miage.gnote.usercmp.bean.Etudiant;

public class AffResultatAction extends Action{
	public ActionForward execute( ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response )throws SQLException {

		AffResultatForm monAffResultatForm =(AffResultatForm) form;
		ServletContext context = getServlet().getServletContext();
		QueryBD conBase = new QueryBD(context.getRealPath(""));
		
		//recupération du numéro de formation
		int numeroFormation=Integer.parseInt(monAffResultatForm.getChoix());
		

		//ici récupération de l'étudiant de la session 
		HttpSession session = request.getSession(true);
		Etudiant st=(Etudiant) session.getAttribute("user");
		
		//ici remplissage du tableau de note de l'etudiant
		st.getResultatExamen().clear();
		conBase.affectResultatExamenFormation(st, numeroFormation);

		return mapping.findForward("affichage");

	}
}
