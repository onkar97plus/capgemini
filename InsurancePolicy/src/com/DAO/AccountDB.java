package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class AccountDB 
{
  public static Connection getConnection()
  throws Exception
  {
	 
	  
		
	  
	
	  String driverName = "oracle.jdbc.driver.OracleDriver";
	  Class.forName(driverName);
	  Connection conn = DriverManager.getConnection(
	               "jdbc:oracle:thin:@10.219.34.3:1521/orcl","trg640","training640");
	
	return conn;
  }
  

}
