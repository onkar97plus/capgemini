package com.Connections;
import java.sql.Connection;
import java.sql.DriverManager;
 
	public class ConnectionsCom {	
		public static Connection getcon() {
			Connection c=null;
			try
			{
				Class.forName("oracle.jdbc.OracleDriver");
				c=DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521/orcl","trg640","training640");
				System.out.println("connected");
			}
			catch(Exception e) {
				System.out.println(e);
			}
			return c;
		}
 
	}


