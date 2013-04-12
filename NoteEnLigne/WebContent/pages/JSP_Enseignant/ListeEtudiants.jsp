<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
<title>Insert title here</title>
</head>
<body>
<header id="header"> <hgroup>
	<h1 class="site_title">
		<a href="index.html"><img width="50%" height="50%"
			src="images/logo.png" title="Note Miage" /></a>
	</h1>
	<h2 class="section_title">Liste des étudiants</h2>
	</div>
	</hgroup> </header>
        <br><br>
        <div>
            <FORM action="">
                <SELECT name="promotion" size="1">
                    <OPTION>L3 Classique
                    <OPTION>M1 Classique
                    <OPTION>M2 Classique
                </SELECT>
                <input type="submit" name="Envoyer" value="Envoyer">
            </FORM>
            <table>
                <tr>
                    <td>N° Etudiant</td>
                    <td>Nom</td>
                    <td>Prénom</td>
                    <td>Promotion</td>
                    <td></td>
                </tr>
                <tr>
                    <td>27007136</td>
                    <td>BEL-HYAD</td>
                    <td>KARIMA</td>
                    <td>M1 Classique</td>
                    <td><input type="button" name="Fiche" value="fiche"></td>
                </tr>
                
            </table>
        </div>
   

</body>
</html>