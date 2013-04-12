<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<a class="btn btn-danger" href="index.jsp">Déconnexion</a> <br>
<fieldset>
        <h3 align="center">Bonjour Monsieur <jsp:getProperty name="enseignant" property="nom"/>!</h3>
        <h2 align="center">Bienvenue dans l'interface de saisie des notes </h2>
        
        
            <form method="POST" action="saisirNoteForm">
            <table align="center">
                
                <thead> <!-- En-tête du tableau -->
                  <tr>
                    <th>Numero etudiant</th>
                    <th>Nom</th>
                    <th>Prenom</th>
                    <th>Module</th>
                    <th>Note</th>
                  </tr>
            </thead>

            <tbody> <!-- Corps du tableau -->
                 <tr>
                    <td>
                       <select name="numEtudiant" id="netudiant">
                         <option value="france">2659842</option>
                         <option value="espagne">2556856</option>
                    </td>
                    <td><input type="text" id="nom" name="nom" value="" /></td>
                    <td><input type="text" id="prenom" name="prenom" value="" /></td>
                     <td>
                        <select name="module" id="module">
                         <option value="france">CAR 1</option>
                         <option value="espagne">UML</option>
                         <option value="espagne">Java</option>
                         <option value="espagne">Reseau</option>
                     </td>
                    <td><input type="text" id="note" name="note" value="" /></td> 
                    <td><input type="submit" name="statut" value="Enregistrer" /></td>
                 </tr>
       
    
   </tbody>
            </table>
            </form>
        </fieldset>
</body>
</html>