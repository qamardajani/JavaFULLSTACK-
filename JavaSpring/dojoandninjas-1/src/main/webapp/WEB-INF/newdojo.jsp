<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> NEW DOJO</h1>
<form:form action="/dojos/new" method="post"  modelAttribute="dojo">
			<input type="text" name="name">
			
		    <input type="submit" value="create"/>
		</form:form>
</body>
</html>