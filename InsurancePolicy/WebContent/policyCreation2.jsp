<%@ page import="java.sql.*" %>
<%ResultSet resultset =null;%>
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
					

	</div>
<form action="pc1">
<table align="center">
<tr><th style="color: #FFF; font-style: bold; font-size:20px">enter account number:</th><td><input type="text" name="accno"></td></tr>
 </table><br><br>
 <table align="center" border=1px>
 <%
try{
Class.forName("oracle.jdbc.OracleDriver");
Connection connection = 
         DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521/orcl","trg640","training640");
       Statement statement = connection.createStatement() ;
       ResultSet ques=null;
       for(int i=20;i<=27;i++){
	ques=statement.executeQuery("select pol_ques_desc,pol_ques_ans1,pol_ques_ans2,pol_ques_ans3 from policy_questions where pol_ques_id="+i);
	%>
	 <% while(ques.next()){ %>
	 
	 <tr>
	 <th style="color: #E4DA61;text-shadow: 2px 2px black; font-style: bold; font-size:20px">
            <%= ques.getString(1) %></th>
          
            <td style="color: #FFF; font-style: bold; font-size:20px"><input type="radio" name="<%=ques.getString(1)%>" value="<%=ques.getString(2) %>" required><%= ques.getString(2) %></td>
            <td style="color: #FFF; font-style: bold; font-size:20px"><input type="radio" name="<%=ques.getString(1)%>" value="<%=ques.getString(3) %>" required><%= ques.getString(3) %></td>
            <td style="color: #FFF; font-style: bold; font-size:20px"><input type="radio" name="<%=ques.getString(1)%>" value="<%=ques.getString(4) %>" required><%= ques.getString(4) %></td>
    
            </tr>
     
        <%}%> 

<%
       
}
     
}
        catch(Exception e)
        {
             out.println("wrong entry"+e);
        }
%>
 </table>
 <br><br>
<center><input type="submit" value="submit"></center>
</form>
</body>
</html>
