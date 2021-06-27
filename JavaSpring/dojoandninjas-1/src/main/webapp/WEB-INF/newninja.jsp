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

	
	
		<h2>Add a Ninja</h2>
		<form:form action="/ninjas/new" method="post" modelAttribute="ninja">
		        <label >Dojo Name</label>
	
		        <select name="dojo">
		        <c:forEach items="${ dojo }" var="dojo">
		        	<option value="${ dojo.id }">${ dojo.name }</option>
		        </c:forEach>
		        </select>
		 
		        <form:label path="firstName">First Name</form:label>
		        <form:errors path="firstName"/>
		        <form:input  path="firstName"/>
		 
		        <form:label path="lastName">Last Name</form:label>
		        <form:errors path="lastName"/>
		        <form:input  path="lastName"/>
		 
		  
		        <form:label path="age">Age</form:label>
		        <form:errors path="age"/>
		        <form:input  path="age"/>
		  
		    <button>Add Ninja</button>
		</form:form>
	
</body>
</html>