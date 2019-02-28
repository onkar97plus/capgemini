package controller;


	
	import java.io.IOException;

	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	
import com.Service.ProfileService;


	//import com.ram.services.BookService;

	public class ProfileController extends HttpServlet
	{
	public  void doGet(HttpServletRequest request,HttpServletResponse response) 
	   throws ServletException,IOException 
	{
		RequestDispatcher rd = null;
		RequestDispatcher req = null;
		String username="";
		String password="";
		String rolecode="";
		
		
		username=request.getParameter("username");
		password=request.getParameter("password");
		rolecode=request.getParameter("rolecode");
		/*insured_state=request.getParameter("insured_state");
		String insured_zip1=request.getParameter("insured_zip");
		insured_zip=Integer.parseInt(insured_zip1);
		business_segment=request.getParameter("business_segment");*/
		/*business_segment=request.getParameter("business_segment");
		 try 
		    {

		        String page = request.getParameter("business_segment");



		        if(request.getParameter("business_segment").equals("BusinessAuto"))
		        {

		            request.setAttribute("s1", page);
		            req= getServletContext().getRequestDispatcher("/BusinessAuto.jsp");
		            req.forward(request, response);
		        }
		        else if(request.getParameter("business_segment").equals("Apartment"))
		        {
		            request.setAttribute("s2", page);
		             req = getServletContext().getRequestDispatcher("/policyCreation2.jsp");
		            req.forward(request, response);
		        }
		        else if(request.getParameter("business_segment").equals("Restaurant"))
		        {
		            request.setAttribute("s3", page);
		             req = getServletContext().getRequestDispatcher("/policyCreation3.jsp");
		            req.forward(request, response);
		        }
		        else if(request.getParameter("business_segment").equals("General_Merchant"))
		        {
		            request.setAttribute("s3", page);
		             req = getServletContext().getRequestDispatcher("/policyCreation4.jsp");
		            req.forward(request, response);
		        }


		    } 
		    finally 
		    {
		       System.out.println("");
		   
		    }*/
		 
		 ProfileService bookService = new ProfileService();
			
		
			
		   int updateCount = bookService.addStudentService(username, password, rolecode);
				
				System.out.println("inserted "+updateCount+" record   Success");
				
				if (updateCount==1)
				{
					rd = request.getRequestDispatcher("/Mainlogin.jsp");				
				}
				
				
				else 
				{
					rd = request.getRequestDispatcher("/Error.jsp");
				}
				rd.forward(request, response);
				
			}
	
		 
	}

		





		
		
		
		
		
		
		
		
		
		
		
		
			
			
			/*AccountService bookService = new AccountService();
		
	   int updateCount = bookService.addStudentService(insured_name,insured_street,insured_city,insured_state,insured_zip,business_segment,account_number);
			
			System.out.println("inserted "+updateCount+" record   Success");
			
			if (updateCount==1)
			{
				
				rd = request.getRequestDispatcher("/success.jsp");
				
			} else
			{
				rd = request.getRequestDispatcher("/error.jsp");
			}
			rd.forward(request, response);
		}
			*/
			
			



