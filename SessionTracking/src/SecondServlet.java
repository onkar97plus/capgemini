import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		try
		{
			res.setContentType("text/html");
			PrintWriter out=res.getWriter();
			
			HttpSession session=req.getSession(false);
			String name=(String)session.getAttribute("uname");
			out.println("Hello "+name);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}                                                                                 
}
