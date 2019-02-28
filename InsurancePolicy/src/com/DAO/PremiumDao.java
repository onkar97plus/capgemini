package com.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.Connections.ConnectionsCom;



public class PremiumDao {
	Connection con=null;
	Statement stmt=null;
	ResultSet resultSet = null;
	public int CalDao(HashMap<String, String> ans) {
		int total=0;
		// TODO Auto-generated method stub
		try {
			con=ConnectionsCom.getcon();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		try {
			stmt=con.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//Ans 1
		for(Map.Entry<String, String> m:ans.entrySet())
		{
			String s1=m.getValue();
			String s2=m.getKey();
			//System.out.println(s1+" "+s2);
			try {
			String sql="select pol_ques_ans1_weightage from Policy_Questions where Pol_Ques_Ans1='"+s1+"' and pol_ques_desc='"+s2+"'";
			//String sql1="insert into policy_details values(?,(select pol_ques_desc where pol_ques_desc='"+s2+"'),(select pol_ques_desc where Pol_Ques_Ans1='"+s1+"'))";
			
			
				resultSet=stmt.executeQuery(sql);
			   while(resultSet.next()) {
				total+=resultSet.getInt(1);
				
			   }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		//Ans 2
		for(Map.Entry<String, String> m:ans.entrySet())
		{
			String s1=m.getValue();
			String s2=m.getKey();
			//System.out.println(s1+" "+s2);
			try {
			String sql="select pol_ques_ans2_weightage from Policy_Questions where Pol_Ques_Ans2='"+s1+"' and pol_ques_desc='"+s2+"'";
			
			
			
				resultSet=stmt.executeQuery(sql);
			   while(resultSet.next()) {
				total+=resultSet.getInt(1);
			   }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		//Ans 3
		for(Map.Entry<String, String> m:ans.entrySet())
		{
			String s1=m.getValue();
			String s2=m.getKey();
			//System.out.println(s1+" "+s2);
			try {
			String sql="select pol_ques_ans3_weightage from Policy_Questions where Pol_Ques_Ans3='"+s1+"' and pol_ques_desc='"+s2+"'";
			
			
			
				resultSet=stmt.executeQuery(sql);
			   while(resultSet.next()) {
				total+=resultSet.getInt(1);
			   }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		//System.out.println(total);
		return total;
	}


}

