<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

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
	$(".tab_content").hide(); //Hide all content
	$("ul.tabs
	li:first").addClass("active").show(); //Activate first
	tab
	$(".tab_content:first").show(); //Show first tab content

	//On
	Click Event
	$("ul.tabs li").click(function() {

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
<body>
	<header id="header"> <hgroup>
	<h1 class="site_title">
		<a href="index.html"><img width="50%" height="50%"
			src="images/logo.png" title="Note Miage" /></a>
	</h1>
	<h2 class="section_title">Affichage des notes</h2>
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
		<a href="Welcome.do">Accueil</a>
		<div class="breadcrumb_divider"></div>
		<a class="current">Affichage note</a></article>
	</div>
	</section>
	<!-- end of secondary bar -->

	<aside id="sidebar" class="column"> <a class="btn btn-danger"
		href="index.jsp">Deconnection</a> <br>

	<hr />
	<h3>
		<img src="images/buro.png" />&nbsp;&nbsp; Notes
	</h3>
	<ul class="toggle">
		<li class="icn_new_article"><a href="afnote.html">Afficher</a></li>
		<li class="icn_add_user"><a href="saisirNote.html">Saisir</a></li>
		<li class="icn_add_user"><a href="modNote.html">Modifier</a></li>
	</ul>
	<h3>
		<img src="images/buro.png" />&nbsp;&nbsp;&nbsp; Cours
	</h3>
	<ul class="toggle">
		<li class="icn_edit_article"><a href="#">UE 1</a></li>
		<li class="icn_tags"><a href="#">UE 2 </a></li>
		<li class="icn_profile"><a href="#">UE 3</a></li>
	</ul>
	<h3>
		<img src="images/buro.png" />&nbsp; &nbsp;Examen
	</h3>
	<ul class="toggle">
		<li class="icn_folder"><a href="#">Saisir</a></li>
		<li class="icn_new_article"><a
			href="creationExamf.do">Creer</a></li>
		<li class="icn_photo"><a href="#">Modifier</a></li>

	</ul>

	<footer>
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
	<h2>
		<p align="center">Bienvenue sur l'espace enseignant</p>
	</h2>
	<br>

	</article>
	</section>

</body>
</html>