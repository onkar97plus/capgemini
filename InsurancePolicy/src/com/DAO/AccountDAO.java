package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServlet;

import com.Bean.AccountBean;



//import com.ram.beans.BookBean;
//import com.ram.dao.BookDB;

public class AccountDAO extends HttpServlet
{
	
	
  public static int addStudent(AccountBean bean)
  {
	  
	  Connection con = null;
	  PreparedStatement pstmt = null;
	  try
	  {
		 
		  con=AccountDB.getConnection(); 
		 
		  String ins_str = 
			  "insert into Accountcreation values(?,?,?,?,?,?,Account_number.nextval,?)";
		  
		  
		  pstmt = con.prepareStatement(ins_str);
		
		  pstmt.setString(1,bean.getInsured_name());
		  pstmt.setString(2,bean.getInsured_street());
		  pstmt.setString(3,bean.getInsured_city());
		  pstmt.setString(4,bean.getInsured_state());
		  pstmt.setLong(5,bean.getInsured_zip());
		  pstmt.setString(6,bean.getBusiness_segment());
		  pstmt.setString(7,bean.getUsername());
		 
		  
		  
		  int updateCount = pstmt.executeUpdate();
		  
		  con.close();
		  
		  return updateCount;
		  
		  
	  }
	  catch(Exception ex)
	  {
		  System.out.println(ex.toString());
		  return 0;
	  }
	  
  }
}
  
  
 