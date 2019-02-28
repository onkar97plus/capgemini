package com.ram.dao;
import java.sql.*;

public class BookDB 
{
  public static Connection getConnection()
  throws Exception
  {
	 /* Class.forName("com.mysql.jdbc.Driver");
	  Connection  conn = DriverManager.getConnection(
			  "jdbc:mysql://localhost:3306/test",
			  "root",
			  "root");*/
	
	  String driverName = "oracle.jdbc.driver.OracleDriver";
	  Class.forName(driverName);
	  Connection conn = DriverManager.getConnection(
	               "jdbc:oracle:thin:@10.219.34.3:1521/orcl","trg630","training630");
	
	return conn;
  }

}
