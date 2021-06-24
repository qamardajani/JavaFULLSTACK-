<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> New Person </h1>
<form:form action="/new" method="post"  modelAttribute="person">
			<input type="text" name="firstName">
			<input type="text" name="lastName">
		    <input type="submit" value="create"/>
		</form:form>
</body>
</html>