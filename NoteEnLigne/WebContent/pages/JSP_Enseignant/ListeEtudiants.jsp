<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Liste des étudiants</h1>
        <br><br>
        <div>
            <FORM action="">
                <SELECT name="promotion" size="1">
                    <OPTION>L3 Classique
                    <OPTION>M1 Classique
                    <OPTION>M2 Classique
                </SELECT>
                <input type="submit" name="Envoyer" value="Envoyer">
            </FORM>
            <table>
                <tr>
                    <td>N° Etudiant</td>
                    <td>Nom</td>
                    <td>Prénom</td>
                    <td>Promotion</td>
                    <td></td>
                </tr>
                <tr>
                    <td>27007136</td>
                    <td>BEL-HYAD</td>
                    <td>KARIMA</td>
                    <td>M1 Classique</td>
                    <td><input type="button" name="Fiche" value="fiche"></td>
                </tr>
                
            </table>
        </div>
   

</body>
</html>