package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.Bean.AccountBean;
import com.Bean.ProfileBean;

public class ProfileDAO
{

	
	  public static int addStudent(ProfileBean bean)
	  {
		  Connection con = null;
		  PreparedStatement pstmt = null;
		  try
		  {
			 
			  con=AccountDB.getConnection(); 
			 
			  String ins_str = 
				  "insert into userrole values(?,?,?)";
			  
			  pstmt = con.prepareStatement(ins_str);
			
			  pstmt.setString(1,bean.getUsername());
			  pstmt.setString(2,bean.getPassword());
			  pstmt.setString(3,bean.getRolecode());
			 
			  
			 
			  
			  
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
