
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html>
<head>
<title><bean:message key="welcome.title"/></title>
<html:base/>
</head>
<body bgcolor="white">


<form id="login" >
    <h1>Authentification</h1>
    <br/>
    <fieldset id="inputs">
        <input id="user" type="text" name="user" placeholder="Utilisateur" autofocus required>
        &nbsp;&nbsp;&nbsp;   
        <input id="pass" type="password" name="pass" placeholder="Mot de passe" required>
    </fieldset>
   
</form>
</body>
</html:html>
