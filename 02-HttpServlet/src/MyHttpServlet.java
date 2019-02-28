
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHttpServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter out=res.getWriter();
		out.println("Welcome to httpservlet");
		
		String uname=req.getParameter("uname");
		String password=req.getParameter("password");
		
		out.println("username: "+uname);
		out.println("password: "+password);
		System.out.println("welcome to httpservlet");
	}

}
