<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
</head>
<body>
<form  action="/">
    <label>Your Name: <c:out value="${username}"/></label>
    <br>
    <label>Dojo Location:</label>
<c:out value="${dojolocation}"/>
<br>
<label>Favoraite language</label>
<c:out value="${favlan}"/>
<br>
<label>Comment (optional):</label>
<br>
<c:out value="${comment}"/>
<br>
<button>Go back</button>
</form>
</body>
</html>