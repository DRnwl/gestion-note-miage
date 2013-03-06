<%--
    Licensed to the Apache Software Foundation (ASF) under one or more
    contributor license agreements.  See the NOTICE file distributed with
    this work for additional information regarding copyright ownership.
    The ASF licenses this file to You under the Apache License, Version 2.0
    (the "License"); you may not use this file except in compliance with
    the License.  You may obtain a copy of the License at
   
         http://www.apache.org/licenses/LICENSE-2.0
   
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
--%>
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


<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<logic:redirect forward="welcome"/>

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

<%--

Redirect default requests to Welcome global ActionForward.
By using a redirect, the user-agent will change address to match the path of our Welcome ActionForward. 

--%>
</html>
