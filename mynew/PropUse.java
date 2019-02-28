package com.cg.mynew;

import java.sql.Connection;
import java.sql.*;
import java.io.FileInputStream;
import java.util.Properties;

public class PropUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		
		try {
			prop.load(new FileInputStream("Data.properties"));
			
			String user= prop.getProperty("Username");
			String pass= prop.getProperty("password");
			String r=prop.getProperty("rno");
			String a=prop.getProperty("add");
			String n=prop.getProperty("nm");
			String url=prop.getProperty("url");
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection(url,user,pass);
			System.out.println("Connected");
			
			Statement smt=con.createStatement();
			String sql="select "+prop.getProperty("rno")+","+prop.getProperty("add")+","+prop.getProperty("nm")+ " from emp";
			System.out.println(sql);
			ResultSet rs=smt.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2) + " "+rs.getString(3));
			}
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
