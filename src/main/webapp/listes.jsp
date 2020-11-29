<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
<link rel="stylesheet" href="styles.css">
</head>

<body>
<div class="row">
<div class="column">
Listes femmes: </br>
<c:forEach var = "joueur" items="${listeFemmes}">
		<TR>
        	<TD>${joueur.prenom}</TD><TD>${joueur.nom}</TD>
		</TR>
      	</c:forEach>
<table>
Listes Hommes: </br>
<c:forEach var = "joueur" items="${listeHommes}">
		<TR>
        	<TD>${joueur.prenom}</TD><TD>${joueur.nom}</TD>
		</TR>
      	</c:forEach>
</table>
</div>
<div class="column">
Listes hommes: </br>


</div>
</div>
</body>