<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Note en ligne MIAGE</title>
	<link rel="stylesheet" href="../../css/style.css" type="text/css" media="screen" />
	
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

</head>


<body>

	<header id="header">
		<hgroup>
			<h1 class="site_title"><a href="index.html"><img width="80%" height="80%" src="images/logo.png" title="Note Miage"/></a></h1>
			<h2 class="section_title"> Gestion des notes de la miage </h2></div>
		</hgroup>
	</header> <!-- end of header bar -->
	
	<section id="secondary_bar">
		<div class="user">
		</div>
		<div class="breadcrumbs_container">
			<article class="breadcrumbs"><a href="index.html">Note</a> <div class="breadcrumb_divider"></div> <a class="current">Examen</a></article>
		</div>
	</section><!-- end of secondary bar -->
	<aside id="sidebar" class="column">
	</aside>
	
	
	
	
		<article class="module width_full">
			<form id="auth" method="POST" action="Authentification.do">
			
			
			<br />
			
			    <fieldset id="input">
				<h5>Login </h5><input id="," type="text" name="login" /> 
				<h5>Mot de passe </h5><input id="mdp" type="password" name="mdp" />
                             <div> <input type="submit" value="soumettre"/></div>
			                </fieldset> 
			<br>
			
		</form>
				
			
		</article><!-- end of post new article -->
         <footer>
			<hr />
			<p><strong>Copyright &copy; Miage UPO 2013 </strong></p>
			<p><a href="#"></a></p>
		</footer>
	</section>
	


</body>

</html>