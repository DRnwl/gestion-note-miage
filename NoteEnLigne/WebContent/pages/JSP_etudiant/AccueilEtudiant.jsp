<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body><div id="contenu">
        <h1>Bonjour<br/><br/></h1>
        <h2>Bonjour <bean:write name="user" property="nom" scope="request"/>
                    <bean:write name="user" property="prenom" scope="request"/></h2>
        <h2>Bienvenue sur l'espace Etudiant</h2><br/>
        <p>MENU:<br/> 
        
             <br/>
            
            
           
          
        </p>
    </div>
</body>

</html>