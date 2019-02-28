import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		try
		{
			res.setContentType("text/html");
			PrintWriter out=res.getWriter();
			String name=req.getParameter("UserName");
			out.println("welcome: "+name);
			
			HttpSession session=req.getSession();
			session.setAttribute("uname",name);
			
			out.println("<a href='SecondServlet'>Visit next page</a>");
			out.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}