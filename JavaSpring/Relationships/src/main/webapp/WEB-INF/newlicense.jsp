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
<h1>NEW License</h1>
<form:form action="/license/new" method="post">
person : <select name="person">
        <c:forEach items="${ person }" var="person">
            <option value="${person.id}">${person.firstName}</option>
        </c:forEach>
        </select>
        Expiration Date: <input type="date" name="expirationDate">
     
        State : <input type="text" name="state">
<input type="submit">
</form:form>
</body>
</html>