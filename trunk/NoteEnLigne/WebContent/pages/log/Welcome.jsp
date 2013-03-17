
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html>
<head>
<title><bean:message key="welcome.title"/></title>
<html:base/>
</head>
<body bgcolor="white">


<html:errors />

<html:form action="/Login" >
User Name :<html:text name="LoginForm" property="userName" />
Password  :<html:password name="LoginForm" property="password" />
<html:submit value="Login" />
</html:form>
</body>
</html:html>
