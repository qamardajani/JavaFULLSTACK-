<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
	crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css" />
<title>Languages App</title>
</head>
<body>
	<div class="container">
		<h1>Welcome to Languages Dot Com!</h1>
		<a href="/languages/new">Add a language</a>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Name</th>
					<th>Creator</th>
					<th>Version</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${ language }" var="lang">
				<tr>
					<td><a href="/${ lang.id }">${ lang.name }</a></td>
					<td>${ lang.creator }</td>
					<td>${ lang.version }</td>
					<td>
						<a class="btn btn-primary" href="/${ lang.id }/edit">Edit</a>
						<form id="delete-form" action="/${lang.id}" method="post">
						    <input type="hidden" name="_method" value="delete">
						    <input class="btn btn-danger" type="submit" value="Delete">
						</form>
					</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		</div>
			<div class="container">
		<h1>New Language</h1>
		<form:form action="/new" method="POST"  modelAttribute="language">
			<input type="text" name="name">
			<input type="text" name="creator">
			<input type="text" name="version">
		    <input type="submit" value="Submit"/>
		</form:form>
	</div>
</body>
</html>