package controller;



	import java.io.IOException;
	import java.io.PrintWriter;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;

	import javax.servlet.ServletException;

	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;


	public class Account extends HttpServlet
	
	{
		private static final long serialVersionUID = 1L;
	 
	    public Account() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	 
		/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			response.getWriter().append("Served at: ").append(request.getContextPath());
		}*/
	 
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			//doGet(request, response);
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
	 /*
			String ID = request.getParameter("id");
			int id = Integer.parseInt(ID);*/
	        
			try { 
				Class.forName("oracle.jdbc.OracleDriver");
			
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:"+"@10.219.34.3:1521/orcl","trg640","training640");
				PreparedStatement ps = con.prepareStatement("select account_number.nextval from dual");
				PreparedStatement ps1 = con.prepareStatement("select account_number.currval from dual");
				
				
				ResultSet rs = ps.executeQuery();
	 
				ResultSet rs1 = ps1.executeQuery();
	 
				while (rs1.next()) 
				{
					int a= rs1.getInt(1);
				int b=a-1;
					out.println("The Account number is : " + b);
					out.println("<br><br><a href='Admin.jsp'>Return to admin</a>");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				out.close();
			}
			System.out.println("retrieved data");
		
		}
	 
	}

