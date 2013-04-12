<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fiche Etudiante</title>
</head>
<body>
<header id="header"> 
<hgroup>
	<h1 class="site_title">
		<a href="index.html"><img width="50%" height="50%" src="images/logo.png" title="Note Miage" /></a>
	</h1>
	<h2 class="section_title">Liste des étudiants</h2>
	</hgroup>
	</header>
	<a class="btn btn-danger" href="index.jsp">Déconnexion</a> <br>
        <h2>Consulter  Fiche étudiante </h2>
        
        <table  border="9" >
            <tr>
                <td>N° Etudiant</td>
                <td><input type="text" readonly value="nEtudiant" name="nCandidat"/></td>
            </tr>
            <tr>
                <td>Nom</td>
                <td><input type="text" readonly value="nom" name="nom"/></td> 
            </tr>
            <tr>
                <td>Prénom</td>
                <td><input type="text" readonly value="prenom" name="prenom"/></td>
            </tr>
            <tr>
                <td>Promotion</td>
                <td><input type="text"  readonly value="promotion" name="promotion"/></td>
            </tr>
            <tr>
                <td>Date de naissance</td>
                <td><input type="text" readonly value="22/04/1987" name="dateNaissance"/></td>
            </tr>
            <tr>
                <td>Téléphone</td>
                <td><input type="text" readonly value="0147910878" name="telephone"/></td>
            </tr>
            <tr>
                <td>Adresse</td>
                <td><input type="text" readonly value="2 rue emile zola" name="adresse"/></td>
            </tr>
            <tr>
                <td>Mail</td>
                <td><input type="text"  readonly value="xx@u-paris10.fr" name="mail"/></td>
            </tr>
          
        </table>           
</body>
</html>