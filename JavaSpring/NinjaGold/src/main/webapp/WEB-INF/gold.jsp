<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" type="text/css" href="css/style.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    
        <p>Your Gold:</p>
   
    <nav>
        <div>
            <h3> Farm </h3>
            <p>earn (10-20 golds)</p>
            <form action="/process_money" method="POST">
          
                <input type="hidden" name="process" value="farm" />
           
            <button type="submit"> Find Gold !</button>
            </form>
        </div>
        <div>
            <h3> cave </h3>
            <p>earn (5-10 golds)</p>
            <form action="/process_money" method="POST">
          
                <input type="hidden" name="process" value="cave" />
            
            <button type="submit" >Find Gold !</button>
            </form>
        </div>
        <div>
            <h3> house </h3>
            <p>earn (2-5 golds)</p>
            <form action="/process_money" method="POST">
            
                <input type="hidden" name="process" value="house" />
            <button type="submit"> Find Gold !</button>
            </form>
        </div>
        <div>
            <h3> casino </h3>
            <p>earn/take (0-50 golds)</p>
            <form action="/process_money" method="POST">
               
                <input type="hidden" name="process" value="casino" />
            <button type="submit"> Find Gold !</button>
            </form>
            </div> 
            <br> <br>
            <p>Activites:</p>
            <div class="activity">
           
            </div>

    </nav>
</body>
</html>