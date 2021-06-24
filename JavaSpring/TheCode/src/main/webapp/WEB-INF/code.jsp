<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value="${error}"/>
<h1> what is the code ?</h1>

<form method="POST" action="code">
    <label> <input type="text" name="code"></label>
    
    <button>try code</button>
    
</form>

</body>
</html>