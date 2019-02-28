package com.cg.mynew;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class Jdbc_Update {
	public static void main(String a[]) 
    { 
		Scanner sc=new Scanner(System.in);
		Scanner sb=new Scanner(System.in);
		int swt;
		
        String url = "jdbc:oracle:thin:@10.219.34.3:1521/orcl"; 
        String user = "trg632"; 
        String pass = "training632"; 
        
        System.out.println("enter case:\n 1.insert \n 2.update:");
  
        try
        { 
        	Class.forName("oracle.jdbc.driver.OracleDriver"); 
  
            Connection con = DriverManager.getConnection(url,user,pass); 
            
            Statement st = con.createStatement(); 
            int m,b;
            swt=sb.nextInt();
            switch(swt)
            {
            case 1:
            	
            	System.out.println("Enter Name, RollNo, Address");
            	String name=sc.nextLine();
        		int rollno=sb.nextInt();
        		String address=sc.nextLine();
        		
            	String sql="Insert into emp values('"+name+"',"+rollno+",'"+address+"')";
            	m= st.executeUpdate(sql);
            	System.out.println("done:" +m);
            	break;
            case 2: 
            	System.out.println("Set rollno =___ for name=___");
            	
        		int r=sb.nextInt();
        		String n=sc.nextLine();
            	b=st.executeUpdate("update emp set rollno="+r+" where (name='"+n+"')");
            	System.out.println("done:" +b);
            	break;
            default: 
            	System.out.println("invalid choice");
            }
            	  
            	con.close();
        } 
        catch(Exception ex) 
        { 
            System.err.println(ex); 
        } 
    } 
}
