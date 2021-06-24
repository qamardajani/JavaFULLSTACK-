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
<h1>${ person.firstName } ${ person.lastName }</h1>
<h3>${person.license.number} </h3>
<h3>${person.license.state} </h3>
<h3> ${ person.license.expirationDate}</h3>

</body>
</html>