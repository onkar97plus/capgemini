package com.cg.mynew;
import java.sql.*;
//import java.util.Scanner;
//import java.util.*;
public class JavaDB {  
	 
	
	    public static void main(String a[]) 
	    { 
	         
	        String url = "jdbc:oracle:thin:@10.219.34.3:1521/orcl"; 
	        String user = "trg632"; 
	        String pass = "training632"; 
	  
	        try
	        { 
	        	Class.forName("oracle.jdbc.driver.OracleDriver"); 
	  
	            Connection con = DriverManager.getConnection(url,user,pass); 
	  
	            Statement st = con.createStatement(); 
	            ResultSet m = st.executeQuery("select * from emp"); 
	            while(m.next())  
	            	System.out.println(m.getString(1)+" "+m.getInt(2)+" "+m.getString(3));  
	            	con.close(); 
	        } 
	        catch(Exception ex) 
	        { 
	            System.err.println(ex); 
	        } 
	    } 
	} 
