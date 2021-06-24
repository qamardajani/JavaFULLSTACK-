<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/languages"  method="POST">
<label>Name</label>
<input type="text" name="name">
 <label>creator</label>
<input type="text" name="creator">
<label>version</label>
<input type="text" name="version">
<button> submit</button>
</form>
</body>
</html>
