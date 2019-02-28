package com.cg.mylabass;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class First_prop {
	public static void main(String[] args)
	{
		Properties prop=new Properties();
		try
		{
			prop.load(new FileInputStream("New.properties"));
			String user=prop.getProperty("username");
			String pass=prop.getProperty("password");
			String empno=prop.getProperty("eno");
			String empname=prop.getProperty("ename");
			String sal=prop.getProperty("salary");
			String url=prop.getProperty("url");
			Class.forName("oracle.jdbc.OracleDriver");
			Connection c=DriverManager.getConnection(url,user,pass);
			System.out.println("connected");
			Statement stmt=c.createStatement();																	
			String sql="select "+prop.getProperty("ename")+","+prop.getProperty("eno")+","+prop.getProperty("salary")+" from employee";
			System.out.println(sql);
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{
			System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
