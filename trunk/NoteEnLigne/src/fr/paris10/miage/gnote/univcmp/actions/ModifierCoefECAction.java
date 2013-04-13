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
import fr.paris10.miage.gnote.univcmp.actionform.ModifierCoefECForm;
import fr.paris10.miage.gnote.univcmp.basedonnees.QueryBD;
import fr.paris10.miage.gnote.univcmp.bean.EC;
import fr.paris10.miage.gnote.usercmp.bean.Enseignant;

public class ModifierCoefECAction extends Action{
	public ActionForward execute( ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response )throws SQLException {

		System.out.println("je suis dans l'action de modif coef");
		ModifierCoefECForm monForm =(ModifierCoefECForm) form;
		System.out.println(form);
		ServletContext context = getServlet().getServletContext();
		QueryBD conBase = new QueryBD(context.getRealPath(""));
		
		//recupération du numéro de formation
		String coef=monForm.getCoef();
		System.out.println("coef:"+coef);
		String libelle=monForm.getLibelle();
		System.out.println("libelle: "+libelle);
		
		//ici récupération de l'étudiant de la session 
		HttpSession session = request.getSession(true);
		Enseignant ens=(Enseignant) session.getAttribute("user");
		int numeroEC=0;
		int numeroFormation=0;
		System.out.println("taille du T: "+ens.getListeECFormation().size());
		for(EC ec: ens.getListeECFormation()){
			System.out.println("JE suis dans le for, ec vaut "+ec.getLibelle() +" et libelle "+libelle);
			if(ec.getLibelle().equalsIgnoreCase(libelle)){
				numeroEC=ec.getNumeroEC();
				numeroFormation=ec.getFormation().getNumeroFormation();
			}
		}
		System.out.println("libelle: "+libelle);
		System.out.println("coef: "+coef);
		System.out.println("nformation: "+numeroFormation);
		System.out.println("nec: "+numeroEC);
		conBase.ModifierCoefEC(numeroFormation, numeroEC, coef);
		return mapping.findForward("modifCoef");

	}
}
