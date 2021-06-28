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
    <h1>${category.name}</h1>
    <h3>Products</h3>
	    <c:forEach items="${ category.products }" var="product">
			<p>${product.name}</p>
	    </c:forEach>
	<form:form action="/category/${category.id}" method="post">
	<select name="product">
	    <c:forEach items="${ product }" var="product">
			<option value="${product.id }">${product.name}</option>
	    </c:forEach>
	</select>
		<input type="hidden" name="category" value="${category.id}">
		<input type="submit" value="add">
	</form:form>
	
</body>