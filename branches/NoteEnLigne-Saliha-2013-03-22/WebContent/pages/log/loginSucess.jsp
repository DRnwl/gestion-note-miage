<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html>
<head>
<title><bean:message key="errors.title"/></title>
<html:base/>
</head>
<body bgcolor="white">

login <bean:write name="login" property="login" scope="request" /><br>
mot de passe <bean:write name="login" property="mdp" scope="request" /><br>
</body>
</html:html>