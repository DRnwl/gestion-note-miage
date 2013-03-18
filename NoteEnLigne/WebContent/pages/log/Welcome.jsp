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
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html>
<head>
<title><bean:message key="welcome.title"/></title>
<html:base/>
</head>
<body bgcolor="white">

<logic:notPresent name="org.apache.struts.action.MESSAGE" scope="application">
  <font color="red">
    ERROR:  Application resources not loaded -- check servlet container
    logs for error messages.
  </font>
</logic:notPresent>

        
        
        <div class="header">
        </div>
            <div class ="loginForm"> 
                <form action="Controleur" method="post" name="loginForm" target="_self">
                    <input type="hidden" name="action" value="doLogin"></input>
                    <table  >
                        <tr>
                            <td>Nom utilisateur</td>
                        </tr>
                        <tr><td><input name="username" type="text" /></td></tr>
                        <tr>
                            <td>Mot de passe</td>
                            
                        </tr>
                        <tr><td><input name="password" type="password" /></td></tr>
                        <tr>
                            <td><button  type="submit">Valider</button></td>
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
</html:html>
