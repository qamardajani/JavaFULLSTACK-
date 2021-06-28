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
    <h1>${product.name}</h1>
    <h3>Categories</h3>
	    <c:forEach items="${ product.categories }" var="category">
			<p>${category.name}</p>
	    </c:forEach>
	<form:form action="/product/${product.id}" method="post">
		<select name="category">
	    <c:forEach items="${ category }" var="category">
			<option value="${category.id }">${category.name}</option>
	    </c:forEach>
	</select><br><br>
	<input type="hidden" name="product" value="${product.id}">
	<input type="submit" value="add">
	</form:form>
</body>