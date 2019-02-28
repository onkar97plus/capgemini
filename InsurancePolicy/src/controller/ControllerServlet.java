package controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class ControllerServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		java.util.Date date = new java.util.Date();
		//request.getRequestDispatcher("link.html").include(request, response);
		
		String name=request.getParameter("username");
		String password=request.getParameter("password");
		
		if((password.equals("admin")) && name.equals("admin@cg.com")){
		
		
		request.getRequestDispatcher("/Admin.jsp").include(request, response);
		}
		else
		{
			out.print("please enter the correct credentials!");
			request.getRequestDispatcher("/LoginAdmin.jsp").include(request, response);
		}
		out.close();
	}

}
