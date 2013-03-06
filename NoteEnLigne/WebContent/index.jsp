

<%@ page contentType="text/html; charset=utf-8" language="java"
	import="java.sql.*" errorPage=""%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="css/style.css"></link>
<title>Notes en ligne</title>
</head>

<body>

	<div class="content">
		<div class="header"></div>
		<div class="loginForm">
			<form action="Controleur" method="post" name="loginForm"
				target="_self">
				<input type="hidden" name="action" value="doLogin"></input>
				<table>
					<tr>
						<td>Nom utilisateur</td>
					</tr>
					<tr>
						<td><input name="username" type="text" /></td>
					</tr>
					<tr>
						<td>Mot de passe</td>

					</tr>
					<tr>
						<td><input name="password" type="password" /></td>
					</tr>
					<tr>
						<td><button type="submit">Valider</button></td>
						<td>&nbsp;</td>
					</tr>
				</table>
				<div class="message">
					<%
                            if (request.getAttribute("message") != null) 
                            {
                                out.print(request.getAttribute("message"));
                            }
                        %>
				</div>
			</form>
		</div>
	</div>
</body>
</html>


