<-- 
    Document   : Etudiant
    Created on : 24/03/2013
    Author     : Lydie
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Etudiant consultation notes</title>
    </head>
    <body>
        <jsp:useBean id="user" class="fr.paris10.miage.gnote.usercmp.bean.Etudiant" scope="request" />
        <h1>Bonjour <%= user.getCandidat().getPrenom() %> <%= user.getCandidat().getNom() %></h1>
        <h3>Résultat:</h3>
        <%= user.affResultatExamen() %>
    </body>
</html>