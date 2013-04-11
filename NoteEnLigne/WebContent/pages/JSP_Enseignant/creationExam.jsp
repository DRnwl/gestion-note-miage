<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@page import="fr.paris10.miage.gnote.univcmp.bean.Formation"%>
<%@page import="fr.paris10.miage.gnote.univcmp.bean.UE"%>
<%@page import="fr.paris10.miage.gnote.univcmp.bean.EC"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/style.css" type="text/css"
	media="screen" />
<!--[if lt IE 9]>
	<link rel="stylesheet" href="css/ie.css" type="text/css" media="screen" />
	<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->
<script src="js/jquery-1.5.2.min.js" type="text/javascript"></script>
<script src="js/hideshow.js" type="text/javascript"></script>
<script src="js/jquery.tablesorter.min.js" type="text/javascript"></script>
<script type="text/javascript" src="js/jquc
      	  $("
	.tablesorter").tablesorter(); 
   	 } 
	);
	$(document).ready(function() {

	//When
	page loads...
	$(".tab_content").hide(); //Hide all
	content
	$("ul.tabs li:first").addClass("active").show(); //Activate
	first tab
	$(".tab_content:first").show(); //Show first tab
	content

	//On Click Event
	$("ul.tabs
	li").click(function() {

		$("ul.tabs
	li").removeClass("active"); //Remove
	any "active" class
		$(this).addClass("active"); //Add "active" class
	to selected tab
		$(".tab_content").hide(); //Hide all tab content var
	activeTab=$(this).find( "a").attr("href"); //Find the href attribute
	value to identify the active
	tab + content
		$(activeTab).fadeIn(); //Fade in the active ID content
	returnfalse;
	});

});>
    </script>
<script type="text/javascript">
    $(function(){
        $('.column').equalHeight();
    });
</script>
<title>Accueil Responsable</title>
</head>
<jsp:useBean id="user" scope="session"
	class="fr.paris10.miage.gnote.usercmp.bean.Enseignant" />
<body>
	<header id="header"> <hgroup>
	<h1 class="site_title">
		<a href="index.html"><img width="50%" height="50%"
			src="images/logo.png" title="Note Miage" /></a>
	</h1>
	<h2 class="section_title">Création examens</h2>
	</div>
	</hgroup> </header>
	<!-- end of header bar -->

	<section id="secondary_bar">
	<div class="user">
		<p align="center">
			Bonjour
			<bean:write name="user" property="nom" scope="session" />
			<bean:write name="user" property="prenom" scope="session" />
		</p>

	</div>

	<div class="breadcrumbs_container">
		<article class="breadcrumbs">
		<a href="../../index.html">Accueil</a>
		<div class="breadcrumb_divider"></div>
		<a class="current">Affichage note</a></article>

	</div>

	</section>
	<!-- end of secondary bar -->

	<aside id="sidebar" class="column"> <a class="btn btn-danger"
		href="../../index.jsp">Deconnection</a> <footer>
	<hr />
	<p>
		<strong>Copyright &copy; Miage UPO 2013 </strong>
	</p>
	<p>
		<a href="#"></a>
	</p>
	</footer> </aside>
	<!-- end of sidebar -->
	<article class="module width_full"> <br>
	<br>
	<br>
	<br>
	<br>
	<h3>*champs obligatoire</h3>

	<form id="Insert" method="POST" action="InsertionExam.do">


		<TABLE  align="center" class="formulaire">
			<TR>
				<TD>*Pourcentage :</TD>
				<TD><input id="pour" type="text" name="pour" /></TD>
			</TR>
			<tr>
				<td>Date de l'examen<br>(jj/mm/aa):</td>
				<td><input id="date" type="text" name="date" /></td>
			</tr>
			<tr>
				<td>*UE</td>
				<td><select name="ue">
						<%  
            fr.paris10.miage.gnote.univcmp.bean.UE temp = new fr.paris10.miage.gnote.univcmp.bean.UE();
						ArrayList<UE> listeuE= (ArrayList<UE>) user.getListeEU();
          for(int i = 0; i < listeuE.size(); i++) 
		{       
            	temp=(fr.paris10.miage.gnote.univcmp.bean.UE) listeuE.get(i);
	%>
						<option value="<%=temp.getNumeroUE() %>"><%=temp.getNumeroUE() %></option>
						<% 
	}
    %>
				</select></td>
			</tr>
			<tr>
				<td>*EC:</td>
				<td><select name="ec">
						<%  
						ArrayList<EC> listeEc= (ArrayList<EC>) user.getListeEc();
            for(int i = 0; i < listeEc.size(); i++) 
		{
            		
	%>
						<option value="<%=user.getListeEc().get(i).getLibelle() %>"><%=listeEc.get(i).getLibelle() %></option>
						<% 
	}
    %>
				</select></td>
			</tr>
			<tr>
				<td>*Libellé formation :</td>
				<td><select name="form">
						<%  
						ArrayList<Formation> listeform= (ArrayList<Formation>) user.getListForm();
            for(int i = 0; i < listeform.size(); i++) 
		{
            		
	%>
						<option value="<%=user.getListForm().get(i).getLibelle() %>"><%=listeform.get(i).getLibelle() %></option>
						<% 
	}
    %>
				</select></td>
			</tr>
			<tr>
				<td>*Numero type :<br> (1=final|2=continu)</td>
				<td><input id="numt" type="text" name="numt" /></td>
				<td></td>
			</tr>
			<td>*horaire :</td>
			<td><input id="heure" type="text" name="heure" /></td>
			</tr>
			<tr>
				<td>*Libelle examen :</td>
				<td ><input id="libExam" type="text" name="libExam" /></td>
			</tr>
	
	     	<tr>

			<td ><input type="submit" value="soumettre" /></td>
		    </tr>
       </TABLE>
	</form>
	</article>
	</section>

</body>
</html>