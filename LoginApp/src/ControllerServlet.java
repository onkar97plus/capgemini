

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class ControllerServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher rd=null;
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		try
		{
		if(name.equals("admin") && password.equals("admin")){
			out.print("<html><body><h3>Welcome User!!! "+name+ "</h3></body></html>");
		HttpSession session=request.getSession();
		
		session.setAttribute("name",name);
		request.getRequestDispatcher("Success.jsp").include(request, response);
		}
		else{
			out.print("Please enter correct credentials");
			request.getRequestDispatcher("login.jsp").include(request, response);
		}
		}catch(Exception e) {
			System.out.println(e);
		}
		out.close();
	}

}
