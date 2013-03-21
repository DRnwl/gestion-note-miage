<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>Authentification</title>
    </head>
    <body class="container">
        <h1>Page d'authentification</h1>    
        <form class="form-horizontal" method=POST action="ConnectionAction.do">
            <p>
                <label for="login">Login : </label><input type="text" name="login"/><html:errors property="login"/> 
                <label for="password">Password : </label><input type="password" name="password"/><html:errors property="password"/> 
            </p>
            <p>
                <input type="radio" name="type" value="etudiant"/>Etudiant<br />
                <input type="radio" name="type" value="enseignant"/>Enseignant<br />
                <html:errors property="type"/>
            </p>
            <input class="btn btn-inverse" type=SUBMIT value="Validation">
            <input class="btn btn-inverse" type=RESET value="Reset">  
        </form>
    </body>
</html>
