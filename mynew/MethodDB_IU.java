package com.cg.mynew;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class MethodDB_IU {
	Scanner sc=new Scanner(System.in);
	Scanner sb=new Scanner(System.in);
	static Connection con=null;
	static Statement st=null;
	
	public void Insert () throws Exception
	{
		
		System.out.println("Enter Name, RollNo, Address");
    	String name=sc.nextLine();
		int rollno=sb.nextInt();
		String address=sc.nextLine();
		
		String table;
		System.out.println("enter the table name");
		table=sc.nextLine();
    	String sql="Insert into "+table+" values('"+name+"',"+rollno+",'"+address+"')";
    	int m= st.executeUpdate(sql);
    	System.out.println("done:" +m);
	}
	
	public void Update () throws Exception
	{
		
		System.out.println("Set rollno =___ for name=___");
    	
		int r=sb.nextInt();
		String n=sc.nextLine();
    	int b=st.executeUpdate("update emp set rollno="+r+" where (name='"+n+"')");
    	System.out.println("done:" +b);
	}
	
	public void close() throws Exception
	{
		con.close();
	}
	
	public static void main(String[] args) {
		int flag=1;
		 String url = "jdbc:oracle:thin:@10.219.34.3:1521/orcl"; 
	        String user = "trg632"; 
	        String pass = "training632"; 
		try
        { 
        	Class.forName("oracle.jdbc.driver.OracleDriver"); 
  
            con = DriverManager.getConnection(url,user,pass); 
  
            st = con.createStatement();  
            MethodDB_IU obj=new MethodDB_IU();
            while(flag==1) {
            obj.Insert();
            obj.Update();
            obj.close();
            }
        } 
        catch(Exception ex) 
        { 
            System.err.println(ex); 
        } 

	}

}
