<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body><div id="contenu">
                   
   <section id="secondary_bar">
		<div class="user">
			<h1>Bonjour<br/><br/></h1>
        <h2>Bonjour <bean:write name="user" property="nom" scope="request"/>
                    <bean:write name="user" property="prenom" scope="request"/></h2>
        <h2>Bienvenue sur l'espace Etudiant</h2><br/>
		</div>
		<div class="breadcrumbs_container">
			<article class="breadcrumbs"><a href="index.html">Accueil</a> <div class="breadcrumb_divider"></div> <a class="current">Affichage note</a></article>
		</div>
	</section><!-- end of secondary bar -->         
           
          
        </p>
        <h3>UE 1</h3>
		<ul class="toggle">
			<li class="icn_new_article_active"><a  href="#">EC 1</a></li>
			<li class="icn_add_user"><a href="#"> EC 2</a></li>
			<li class="icn_categories"><a href="#">EC 3</a></li>
			<li class="icn_view_users"><a href="#">EC 4</a></li>
		</ul>
		<h3>UE 2</h3>
		<ul class="toggle">
			<li class="icn_new_article_active"><a  href="#">EC 1</a></li>
			<li class="icn_add_user"><a href="#"> EC 2</a></li>
			<li class="icn_categories"><a href="#">EC 3</a></li>
			<li class="icn_view_users"><a href="#">EC 4</a></li>
		</ul>
		<h3>UE 3</h3>
		<ul class="toggle">
			<li class="icn_new_article_active"><a  href="#">EC 1</a></li>
			<li class="icn_add_user"><a href="#"> EC 2</a></li>
			<li class="icn_categories"><a href="#">EC 3</a></li>
			<li class="icn_view_users"><a href="#">EC 4</a></li>
			
		</ul>
		<h3>EU 4</h3>
		<ul class="toggle">
			<li class="icn_new_article_active"><a  href="#">EC 1</a></li>
			<li class="icn_add_user"><a href="#"> EC 2</a></li>
			<li class="icn_categories"><a href="#">EC 3</a></li>
			<li class="icn_view_users"><a href="#">EC 4</a></li>
		</ul>
		
		<h3>UE 5</h3>
		<ul class="toggle">
			<li class="icn_new_article_active"><a  href="#">EC 1</a></li>
			<li class="icn_add_user"><a href="#"> EC 2</a></li>
			<li class="icn_categories"><a href="#">EC 3</a></li>
			<li class="icn_view_users"><a href="#">EC 4</a></li>
		</ul>
		
		<footer>
			<hr />
			<p><strong>Copyright &copy; Miage UPO 2013 </strong></p>
			<p><a href="#"></a></p>
		</footer>
	</aside><!-- end of sidebar -->
	</section>
                    
                </tbody>
            </table>
        </article>
        <br/>
        <a class ="btn btn-danger" href="index.jsp">Deconnection</a>
    </div>
</body>

</html>