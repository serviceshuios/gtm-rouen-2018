<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>inscription</title>
</head>
<body>
<h2>Formulaire</h2>
<c:forEach var='parameter' items='${paramValues}'> 
     <ul>
        <li><b><c:out value='${parameter.key}'/></b>:</li>
        <c:forEach var='value' items='${parameter.value}'>
           <c:out value='${value}'/>   
        </c:forEach>
     </ul>
  </c:forEach>
</body>
</html>