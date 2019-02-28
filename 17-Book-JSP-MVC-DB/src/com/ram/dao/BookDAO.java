package com.ram.dao;

import com.ram.beans.BookBean;
import java.sql.*;
import java.util.ArrayList;


public class BookDAO 
{
	
	
  public int addBook(BookBean bean)
  {
	  Connection con = null;
	  PreparedStatement pstmt = null;
	  try
	  {
		  /* Class.forName("com.mysql.jdbc.Driver");
	         con = DriverManager.getConnection(
	         "jdbc:mysql://localhost:3309/accdb","root","root"); 
	     */
		  con=BookDB.getConnection(); 
		  
		  String ins_str = 
			  "insert into book values(?,?,?,?)";
		  
		  pstmt = con.prepareStatement(ins_str);
		  
		  pstmt.setInt(1,bean.getBookId());
		  pstmt.setString(2,bean.getTitle());
		  pstmt.setFloat(3,bean.getPrice());
		  pstmt.setString(4,bean.getGrade());
		  
		  
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
  
  
  // Below method, Search by ID Module.    
  public ArrayList getBookDetailsById(int bookId)
			throws Exception
			{
				Connection con = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				
				con = BookDB.getConnection();
				
		    String sel_str ="Select title,price from book where bookId=?";
				  
				  
				  pstmt = con.prepareStatement(sel_str);
				  pstmt.setInt(1,bookId);
				  rs = pstmt.executeQuery();
				  
				  ArrayList result = new ArrayList();
				  if(rs.next())
				  {
					  result.add(rs.getString(1));
					  result.add(rs.getString(2));
					  
				  }
				  else
				  {
					  result.add("Invalid Id");
				  }
				  return result;
				
			}
}
