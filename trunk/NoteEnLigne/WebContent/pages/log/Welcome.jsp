<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Note en ligne MIAGE </title>


<link rel="stylesheet" type="text/css" href="./css/style.css">
<%@ include file="../headers/header.jsp"%>

</head>

<body>
	
         <div id="authpage">	
		<h2>Bienvenue dans  l'application gestion des notes MIAGE Nanterre</h2><br>
	       
		<form id="auth" method="POST" action="Authentification.do">
			
			
			<br />
			
			    <fieldset id="input">
				<h4>Login </h4><input id="login" type="text" name="login" /> 
				<h4>Mot de passe </h4><input id="mdp" type="password" name="mdp" />
                             <div> <input type="submit" value="soumettre"/></div>
			                </fieldset> 
			<br>
			
		</form>
		
	</div>
	


</body>



</html>