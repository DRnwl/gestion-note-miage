<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
        <h3 align="center">Bonjour Monsieur <jsp:getProperty name="enseignant" property="nom"/>!</h3>
        <h2 align="center">Bienvenue dans l'interface de saisie des notes </h2>
        
        
            <form method="POST" action="saisirNoteForm">
            <table align="center">
                
                <thead> <!-- En-tête du tableau -->
                  <tr>
                    <th>Numero etudiant</th>
                    <th>Nom</th>
                    <th>Prenom</th>
                    <th>Module</th>
                    <th>Note</th>
                  </tr>
            </thead>

            <tbody> <!-- Corps du tableau -->
                 <tr>
                    <td>
                       <select name="numEtudiant" id="netudiant">
                         <option value="france">2659842</option>
                         <option value="espagne">2556856</option>
                    </td>
                    <td><input type="text" id="nom" name="nom" value="" /></td>
                    <td><input type="text" id="prenom" name="prenom" value="" /></td>
                     <td>
                        <select name="module" id="module">
                         <option value="france">CAR 1</option>
                         <option value="espagne">UML</option>
                         <option value="espagne">Java</option>
                         <option value="espagne">Reseau</option>
                     </td>
                    <td><input type="text" id="note" name="note" value="" /></td> 
                    <td><input type="submit" name="statut" value="Enregistrer" /></td>
                 </tr>
       
    
   </tbody>
            </table>
            </form>
        </fieldset>
</body>
</html>