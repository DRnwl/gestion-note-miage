
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html>
<head>
<title><bean:message key="errors.title"/></title>
<html:base/>
</head>
<body bgcolor="white">

<h1><bean:message key="errors.mdpIn"/></h1>
<html:link href="../log/Welcome.jsp">Recommencez</html:link>
<jsp:forward    page="Welcome.do"/>
</body>
</html:html>