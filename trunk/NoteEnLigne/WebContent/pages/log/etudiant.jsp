<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <h1>Consultation</h1> 
        <jsp:useBean id="user" class="fr.paris10.miage.gnote.usercmp.bean.Etudiant" scope="request" />
        <h2>Bonjour <%= user.getCandidat().getPrenom() %> <%= user.getCandidat().getNom() %></h2>
        <h3>Veuillez selectionner l'ann�e d�sir�e</h3>
        
        
    </body>
</html>