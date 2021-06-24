<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="/result">
    <label>Your Name: <input type="text" name="username"></label>
    <br>
    <label>Dojo Location:</label>
    <select name="dojolocation" >
  <option value="San jose">San jose</option>
  <option value="Nablus">Nablus</option>
  <option value="ramallah">ramallah</option>
  <option value="tulkarm" >tulkarm</option>
</select>
<br>
<label>Favoraite language</label>
 <select name="favlan">
  <option value="python">python</option>
  <option value="java">java</option>
  <option value="c#">c#</option>
  <option value="mern" >mern</option>
</select>
<br>
<label>Comment (optional):</label>
<br>
<textarea name="comment"></textarea>
<br>
<button>Button</button>
</form>
</body>
</html>