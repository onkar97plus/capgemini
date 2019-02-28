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





public class Fetch extends HttpServlet
{
	private static final long serialVersionUID = 1L;
 
    public Fetch() {
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
 
		String ID = request.getParameter("id");
		int id = Integer.parseInt(ID);
        
		try { 
			Class.forName("oracle.jdbc.OracleDriver");
		
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:"+"@10.219.34.3:1521/orcl","trg640","training640");
			PreparedStatement ps = con.prepareStatement("select a.insured_name,a.insured_street,a.insured_city,a.insured_state,a.insured_zip,a.business_segment,c.policy_premium from accountcreation a inner join policy c on c.account_number=a.account_number where a.account_number=?");
			ps.setInt(1, id);
		
			
 
			ResultSet rs = ps.executeQuery();
			
 
			while (rs.next()) {
				out.println(
						"InsuredName: " + rs.getString(1) + 
						"</br> insured Street: "+ rs.getString(2) + "</br> Insuredcity: " + rs.getString(3)+
						"</br> Insured state: " + rs.getString(4)+ "</br> insuredZip: " + rs.getInt(5)+ 
						"</br> Businesssegment: " + rs.getString(6)+  "</br> Premium amount: " + rs.getInt(7)+"</br>");
						 
						
				
			}
			int i=0;
			PreparedStatement ps1 = con.prepareStatement("select question,answer from policy_details where account_number=?");
		ps1.setInt(1, id);
			ResultSet rs1 = ps1.executeQuery();
			
			while (rs1.next() && i<8) 
			{
				
						out.println("</br> question: "+ rs1.getString(1) + "</br> Answer:" + rs1.getString(2));
			
		               	i++;
			 }
			out.println("<html><body></br></br><font style=\"color: #FFF; font-style: bold; font-size:20px\">"
					+ "<form> <input type=\"button\" value=\"Return to Home page\" onClick=\"javascript:history.go(-2)\" /> </form></font></body></html>");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			out.close();
		}
		System.out.println("retrieved data");
	
	}
	
	
}