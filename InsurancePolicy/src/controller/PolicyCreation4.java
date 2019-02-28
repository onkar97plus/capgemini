package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Connections.ConnectionsCom;
import com.Service.PremiumService;




public class PolicyCreation4 extends HttpServlet
{
	Connection con = null;
	RequestDispatcher rd=null;
	Statement statement = null;
	ResultSet resultSet = null;
	HashMap<String,String> ans=new HashMap<String,String>();
public  void doGet(HttpServletRequest request,HttpServletResponse response) 
   throws ServletException,IOException 
{
	String acno=request.getParameter("accno");
	int accno=Integer.parseInt(acno);
	
	//PrintWriter out=response.getWriter();
	PremiumService premium=new PremiumService();
	try {
		con=ConnectionsCom.getcon();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		statement=con.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String sql ="select Pol_Ques_Desc from policy_questions p,business_segment b where (p.BUS_SEG_ID=b.BUS_SEG_ID) and (b.bus_seg_name='general merchant' )";
	try {
		
		resultSet = statement.executeQuery(sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String Ans1="";
	String Ans2="";
	
	try {
		while(resultSet.next()){
			Ans2=resultSet.getString(1);
			Ans1=request.getParameter(Ans2);
			ans.put(Ans2,Ans1);
			}
		for(Map.Entry<String, String> m:ans.entrySet())
		{
			//System.out.println(m.getKey()+"  "+m.getValue());
			String s1=m.getValue();
			String s2=m.getKey();
			try {
				PreparedStatement sql1=con.prepareStatement("insert into policy_details values(?,?,?)");
				sql1.setInt(1, accno);
				sql1.setString(2,s2);
				sql1.setString(3, s1);
				
				int updateCount1 = sql1.executeUpdate();
				//ResultSet rs = ps.executeQuery();
				  
				  if(updateCount1==1) {
				 
					System.out.println("1 row inserted into policy_details table");
					
				   }
				  else
				  {
					  System.out.println("insertion into policy_details failed!");
				  }
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	int Premiumamount=0;
	Premiumamount=premium.CalculatePremium(ans);
	
	System.out.println("premium amount is"+Premiumamount);
	
	
	
	
	
//	String sql1="insert into policy_details values(?,(select pol_ques_desc where pol_ques_desc='"+s2+"'),(select pol_ques_desc where Pol_Ques_Ans1='"+s1+"'))";
	
	
	
	
	
	
	
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	
/*
	String ID = request.getParameter("id");
	int id = Integer.parseInt(ID);*/
    
	try { 
		Class.forName("oracle.jdbc.OracleDriver");
	
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:"+"@10.219.34.3:1521/orcl","trg640","training640");
		PreparedStatement ps = con.prepareStatement("insert into policy values(policy_seq.nextval,?,"+accno+")");
	
	
		//PreparedStatement ps1 = con.prepareStatement("select sum(vehicletype+vehiclemy+vehiclemodel+dailycd+servicecenter+limit+limit2) from businessauto1 where account_number=?");
		ps.setInt(1, Premiumamount);
		//ps.setInt(2,accno);
		//ps1.setInt(1, id);
		

		//ResultSet rs1 = ps1.executeQuery();
		int updateCount = ps.executeUpdate();
		//ResultSet rs = ps.executeQuery();
		  
		  if(updateCount==1) {
		 
		
			  System.out.println("1 row inserted into policy table");
			  rd = request.getRequestDispatcher("/Thanks.jsp");
						
			}
		 

		  else {
			  System.out.println("insertion not done");
			  rd = request.getRequestDispatcher("/error.jsp");
		  }
		  rd.forward(request,response);
	}catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

      
}
	
}
