<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body  style="background-color:	#4682B4">
<center><h2 style="color:black">LOGIN PAGE</h2></center>
<br>
<br>
<form action="loginServlet">
<div class="container">
 
   <center>Name:<input type="text" placeholder="Username" name="name" required></center>
	<br>
    <center>Password:<input type="password" placeholder="Password" name="password" required></center>
    <br>
    <center><button type="submit">Login</button></center>
   </div>
</form>
<br>
</body>
</html>