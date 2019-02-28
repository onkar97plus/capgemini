package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Service.AccountService;




//import com.ram.services.BookService;

public class AccountController extends HttpServlet
{
public  void doGet(HttpServletRequest request,HttpServletResponse response) 
   throws ServletException,IOException 
{
	RequestDispatcher rd = null;
	RequestDispatcher req = null;
	String insured_name="";
	String insured_street="";
	String insured_city="";
	String insured_state="";
	long insured_zip=0;
	String business_segment="";
	String username="";
	int account_number=0;
	
	insured_name=request.getParameter("insured_name");
	insured_street=request.getParameter("insured_street");
	insured_city=request.getParameter("insured_city");
	insured_state=request.getParameter("insured_state");
	String insured_zip1=request.getParameter("insured_zip");
	insured_zip=Integer.parseInt(insured_zip1);
	business_segment=request.getParameter("business_segment");
	username=request.getParameter("username");
	
	 
	 AccountService bookService = new AccountService();
		
	
		
	   int updateCount = bookService.addStudentService(insured_name, insured_street, insured_city,insured_state,insured_zip,business_segment,account_number,username);
			
			System.out.println("inserted "+updateCount+" record   Success");
			
			if (updateCount==1)
			{
				rd = request.getRequestDispatcher("/Account.jsp");				
			} else 
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
		
		
