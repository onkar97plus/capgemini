<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Trendy Login Form template Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login sign up Responsive web template, SmartPhone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files -->
<!-- web font -->
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'><!--web font-->
<!-- //web font -->
</head>
<body>
	<!-- main -->
	<div class="agileits-main"> 
	<div class="w3top-nav">	
				<div class="w3top-nav-left">	
					<h1><a href="index.html">QuoteGen</a></h1>
				</div>	
				<div class="w3top-nav-right">	
					<ul>
						<li><a href="Index.jsp" class="active">Home</a></li>
						<li><a href="About.jsp">About</a></li>  
						<li><a href="Services.jsp">Services</a></li>  
					</ul> 
				</div>	
				<div class="clear"></div>
			</div>	
					

	</div><br>
	<br>

<!-- <form action="Report" method="post">

	<h1>Click here to view all the details: </h1><input type="submit" value="ViewAllDetails">	

	
	
</form> -->


    <%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.Connections.ConnectionsCom"%>
<%@page import="java.sql.Connection"%>
 
<%
Statement statement = null;
ResultSet resultSet = null;
%>


 

</head>
<body>

<form action ="displayreport.jsp">
<h3 align="center">Policy Retrival</h3>
<table align="center" cellpadding="5" cellspacing="5">
<tr>
<td>Account Number</td>
<td>Policy Number</td>
<td>Premium Amount</td>
</tr>
<%
Connection con = null;
try{ 
/* connection = DriverManager.getConnection("jdbc:oracle:thin@10.219.34.3.1521/orcl","trg635", "training635"); */
con=ConnectionsCom.getcon();
statement=con.createStatement();
String sql ="select a.account_number,p.policy_number,p.policy_premium from accountcreation a,policy p where (a.account_number=p.account_number)";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr bgcolor="#14C2B0">
	<td><%=resultSet.getInt(1) %></td>
	<td><%=resultSet.getInt(2)%></td>
	<td><%=resultSet.getInt(3)%></td>
	</tr>
<% 
}
 
} catch (Exception e) {
e.printStackTrace();
}
%>
 
 
<tr>
<td colspan="2">Enter account Number</td>
<td><input type="text" id="PolNo" name="PolNo" ></td></tr>
<tr>
 
<td></td>
<td><input type="submit" class="button" value="View Details" ></td>
<td></td>
</tr>
</table>
</form>
 
</body>
</html>