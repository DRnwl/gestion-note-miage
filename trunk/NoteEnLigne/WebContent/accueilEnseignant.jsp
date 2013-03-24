<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>Liste des modules</title>
    </head>
    <body class="container">
        <jsp:useBean id="enseignant" scope="request" class="fr.paris10.miage.gnote.univcmp.bean.Enseignant"/>
        <h1>Bonjour <%= enseignant.getNom() %> <%= enseignant.getPrenom() %></h1>
        <form class="form-horizontal" method=POST action="GestionAction.do">
            <p>
                <label for="module">Selectionner le module :</label><br />
                <select name="module" id="module">
                    <%= enseignant.getListModule() %>
                </select>
                <input class="btn btn-inverse" type=SUBMIT value="Validation"><html:errors property="module"/>
            </p>
        </form>
        <a class ="btn btn-danger" href="index.jsp">Deconnection</a>
    </body>
</html>
