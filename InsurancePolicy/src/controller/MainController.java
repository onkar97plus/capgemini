package controller;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class MainController extends HttpServlet
{

		
		PreparedStatement pst=null;
		ResultSet rs=null;
		RequestDispatcher rd=null;
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		String uname=req.getParameter("userName");
		
		String pwd=req.getParameter("userPwd");
		String role="default";
		//Conn c1=new Conn();
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:"+"@10.219.34.3:1521/orcl","trg640","training640");
			String sql="select rolecode from userrole where username = '"+uname+"' and password ='"+pwd+"'";
			Statement stmt=con.createStatement();
			int i=stmt.executeUpdate(sql);
			rs=stmt.executeQuery(sql);
		while(rs.next())
		{
			role=rs.getString(1);
		}
		
		if(role.equals("insured") && i==1)
		{
			rd=req.getRequestDispatcher("/Insured.jsp");
			rd.forward(req,res);
		}
		else if(role.equals("agent") && i==1)
		{
			rd=req.getRequestDispatcher("/Agent.jsp");
			rd.forward(req,res);
		}
		else if(role.equals("admin") && i==1)
		{
			rd=req.getRequestDispatcher("/Admin.jsp");
			rd.forward(req,res);
		}
		else if(i==0){
			rd=req.getRequestDispatcher("/error.jsp");
			rd.include(req, res);
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}

		
}
}

