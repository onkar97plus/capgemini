package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PolicyController extends HttpServlet
{
	
	public  void doGet(HttpServletRequest request,HttpServletResponse response) 
	   throws ServletException,IOException 
	{
		RequestDispatcher rd = null;
		RequestDispatcher req = null;
		
		String business_segment="";
		
		
		
		
		
		 business_segment=request.getParameter("business_segment");
		 try 
		    {

		        String page = request.getParameter("business_segment");



		        if(request.getParameter("business_segment").equals("BusinessAuto"))
		        {

		            request.setAttribute("s1", page);
		            req= getServletContext().getRequestDispatcher("/policyCreation1.jsp");
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
		       System.out.println("Success");
		   
		    }
		
		
		
		
		
		
		
	
	}
}