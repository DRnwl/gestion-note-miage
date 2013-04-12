<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<%@page import="java.util.ArrayList"%>
<%@page import="fr.paris10.miage.gnote.univcmp.bean.PromotionEtudiant"%>
<%@page import="fr.paris10.miage.gnote.univcmp.bean.Formation"%>
<%@page import="fr.paris10.miage.gnote.univcmp.bean.UE"%>
<%@page import="fr.paris10.miage.gnote.univcmp.bean.EC"%>
<%@page import="fr.paris10.miage.gnote.univcmp.bean.Examen"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="css/style.css" type="text/css" media="screen" />
	<!--[if lt IE 9]>
	<link rel="stylesheet" href="css/ie.css" type="text/css" media="screen" />
	<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->
	<script src="js/jquery-1.5.2.min.js" type="text/javascript"></script>
	<script src="js/hideshow.js" type="text/javascript"></script>
	<script src="js/jquery.tablesorter.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="js/jquc
      	  $(".tablesorter").tablesorter(); 
   	 } 
	);
	$(document).ready(function() {

	//When page loads...
	$(".tab_content").hide(); //Hide all content
	$("ul.tabs li:first").addClass("active").show(); //Activate first tab
	$(".tab_content:first").show(); //Show first tab content

	//On Click Event
	$("ul.tabs li").click(function() {

		$("ul.tabs li").removeClass("active"); //Remove any "active" class
		$(this).addClass("active"); //Add "active" class to selected tab
		$(".tab_content").hide(); //Hide all tab content

		var activeTab = $(this).find("a").attr("href"); //Find the href attribute value to identify the active tab + content
		$(activeTab).fadeIn(); //Fade in the active ID content
		return false;
	});

});>
    </script>
    <script type="text/javascript">
    $(function(){
        $('.column').equalHeight();
    });
</script>
<title>Accueil Etudiant</title>
</head>

<body>
         <header id="header">
		<hgroup>
			<h1 class="site_title"><a href="index.html"><img width="60%" height="60%" src="images/logo.png" title="Note Miage"/></a></h1>
			<h2 class="section_title"> Gestion des notes de la miage </h2></div>
		</hgroup>
	</header> <!-- end of header bar -->          
   <section id="secondary_bar">
		<div class="user">
			
        
		</div>
		<div class="breadcrumbs_container">
			<article class="breadcrumbs"><a href="index.html">Accueil</a> <div class="breadcrumb_divider"></div> <a class="current">Affichage note</a></article>
		</div>
	</section><!-- end of secondary bar -->
       <aside id="sidebar" class="column">
       <a class ="btn btn-danger" href="index.jsp">Deconnection</a>
       <br>
	      <p align="center">Bonjour       
          <bean:write name="candidat" property="nom" scope="session"/>
          <bean:write name="candidat" property="prenom" scope="session"/></p>
 
		<h3><img src="images/buro.png"/>&nbsp;&nbsp; Promotion</h3>
		<ul class="toggle">
			<li class="icn_new_article"><a href="afnote.html">2009/2010</a></li>
			<li class="icn_photo"><a href="afnote.html">2011/2012</a></li>
			<li class="icn_add_user"><a href="afnote.html">2012/2013</a></li>
		</ul>
		
		
		<footer>
			<hr />
			<p><strong>Copyright &copy; Miage UPO 2013 </strong></p>
			<p><a href="#"></a></p>
		</footer>
	</aside><!-- end of sidebar -->
	
	
	
	
		<article class="module width_full">
		<br><br><br><br><br><br>
			<jsp:useBean id="user" class="fr.paris10.miage.gnote.usercmp.bean.Etudiant" scope="session" />
			<h3><p align="center"> Bienvenue sur l'espace Etudiant </p></h3>
			<p align="left"> Veuillez choisir l'année de consultation parmis les <%= user.getListPromotionEtudiant().size() %> suivantes:</p>	
			
			<form id="Aff" method="POST" action="Affichage.do">
			
			
			<%  
            for (PromotionEtudiant pe : user.getListPromotionEtudiant()) {      
	%>
				<li><%=pe.getPromotion().getFormation().getType()+ pe.getPromotion().getFormation().getNiveau()+" "+pe.getPromotion().getFormation().getLibelle()+" "+pe.getPromotion().getFormation().getParcours()%>
					<input type="radio" name="choix" value="<%=pe.getPromotion().getFormation().getNumeroFormation()%>"/></li>
	<% 
			}
    %>
			
			<input type="submit" value="soumettre"/>
			</form>
			
			
		</article><!-- end of post new article -->
	
	</section>
  
        <br/>
        
</body>

</html>