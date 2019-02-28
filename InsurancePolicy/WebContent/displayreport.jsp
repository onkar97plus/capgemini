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
    <%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.Connections.ConnectionsCom"%>
<%@page import="java.sql.Connection"%>
 
<%
Statement statement = null;
ResultSet resultSet = null;
ResultSet resultset = null;
%>


<% 
 
int pol=Integer.parseInt(request.getParameter("PolNo"));
 
%>
<form action ="admin.jsp">
<h3 align="center">Report Generation</h3>
<table align="center" cellpadding="5" cellspacing="5" border="1">
<%
Connection con = null;
try{ 
/* connection = DriverManager.getConnection("jdbc:oracle:thin@10.219.34.3.1521/orcl","trg635", "training635"); */
con=ConnectionsCom.getcon();
statement=con.createStatement();
String sql ="select a.INSURED_NAME,a.INSURED_STREET,a.INSURED_CITY,a.INSURED_STATE,a.INSURED_ZIP,a.BUSINESS_SEGMENT,p.POLICY_PREMIUM,a.account_number from accountcreation a,policy p where a.account_number="+pol+" and (a.account_number=p.account_number) ";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr bgcolor="#DEB887"><td>Insured Name:</td><td><%=resultSet.getString(1)%></td></tr>
<tr bgcolor="#DEB887"><td>Insured street:</td><td><%=resultSet.getString(2)%></td></tr>
<tr bgcolor="#DEB887"><td>Insured city:</td><td><%=resultSet.getString(3)%></td></tr>
<tr bgcolor="#DEB887"><td>Insured state:</td><td><%=resultSet.getString(4)%></td></tr>
<tr bgcolor="#DEB887"><td>Insured zip:</td><td><%=resultSet.getInt(5)%></td></tr>
<tr bgcolor="#DEB887"><td>Business segment:</td><td><%=resultSet.getString(6)%></td></tr>
<tr bgcolor="#DEB887"><td>policy preminum:</td><td><%=resultSet.getInt(7)%></td></tr>
<tr bgcolor="#DEB887"><td>policy number:</td><td><%=resultSet.getInt(8)%></td></tr>
<% 
}
 
 
String sql1 =" select pq.POL_QUES_DESC,pd.ANSWER from policy_details pd,policy_questions pq where (pq.POL_QUES_DESC=pd.question) and pd.account_number="+pol+"";
resultset = statement.executeQuery(sql1);
while(resultset.next()){
	%>
	<tr bgcolor="#DEB887"><td>Question:</td><td><%=resultset.getString(1)%></td></tr>
	<tr bgcolor="#DEB887"><td>Answer:</td><td><%=resultset.getString(2)%></td></tr>
	<% 
 
} 
}catch (Exception e) {
e.printStackTrace();
}
%>
<tr><td><a href="Admin.jsp">Return to Admin Home Page</a></td></tr>
</table>
</form>
</body>
</html>