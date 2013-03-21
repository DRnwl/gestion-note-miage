package fr.paris10.miage.gnote.univcmp.actionform;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author lydie
 */
public class ConnectionForm extends ActionForm {
    
    protected String login;
    protected String password;
    protected String type;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (this.login == null || this.login.isEmpty()) {
            errors.add("login", new ActionMessage("errors.login.required"));
        } 
        if (this.password == null || this.password.isEmpty()) {
            errors.add("password", new ActionMessage("errors.password.required"));
        } 
        if (this.type == null || this.type.isEmpty()) {
            errors.add("type", new ActionMessage("errors.type.required"));
        } 
        return errors;
    }
}

