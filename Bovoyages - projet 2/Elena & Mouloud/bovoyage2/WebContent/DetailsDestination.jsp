<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BOVOYAGE</title>

</head>
<body>
<header>
<h1>BOVOYAGE</h1>
<img alt = "plage horizon" src="images/img_haut_page.jpg">
</header>

<c:forEach items="${destinations}" var="d">
<h2>Votre futur séjour : ${d.region } </h2>
</c:forEach>
<c:forEach items="${d.images }" var="img">
	<img src="images/${img}" alt="image séjour"/>
</c:forEach>
<table>
<c:forEach items="${destinations}" var="d">
	<tr><td>${d.description}
		</td>
	</tr>
</c:forEach>



	 
	

</table>
<table>
    <tr><th>Départ</th> <th>Retour</th> <th> Prix HT </th></tr>
	
	
	<c:forEach var ="date" items="${datesVoyages}">
	
	<tr>
		<td>${date.dateAller} </td>
		<td>${date.dateRetour} </td>
		<td>${date.prixHT }</td>
		<td>
		
			<!--  <form action="CommandeVoyageServlet" method="post">
			<input type="hidden" name="id" value="${date.id_pk} ">		
			<button>Commander</button>
			</form>-->
			
			<a href="CommandeVoyageServlet?id=${date.id_pk}">Commander</a>
			
		</td>
	</tr>
		
	</c:forEach>	
</table>	
		
	
	
	

<br>		

<a href="ListDestinationsServlet">Retour à l'accueil</a>


</body>
</html>