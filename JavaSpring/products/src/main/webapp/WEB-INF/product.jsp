<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>New Product</h1>
    <form:form action="/product/new" method="post" >
    Name : <input type="text" name="name">
    Description: <input type="text" name="description">
    Price : <input type="text" name="price">
    <input type="submit">
    </form:form>
</body>