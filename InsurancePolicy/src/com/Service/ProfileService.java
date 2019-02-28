package com.Service;

import com.Bean.AccountBean;
import com.Bean.ProfileBean;

import com.DAO.AccountDAO;
import com.DAO.ProfileDAO;

public class ProfileService
{
	
	 public int addStudentService(String username,String password,String rolecode)
	 {
		
		 
		 ProfileDAO bookDAO = new  ProfileDAO();
		 ProfileBean studentBean = new ProfileBean();
		 //wrap up all the four field values into bean
		 
		 studentBean.setUsername(username);
		 studentBean.setPassword(password);
		 studentBean.setRolecode(rolecode);
		 /*studentBean.setInsured_state(insured_state);
		 studentBean.setInsured_zip(insured_zip);
		 studentBean.setBusiness_segment(business_segment);
		 studentBean.setAccount_number(account_number);*/
		 int updateResult = 0;
		 try
		 {
			 updateResult = ProfileDAO.addStudent(studentBean);
			 return updateResult;
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex.toString());
			 return 0;
		 }
	 }
	 
	 
	 
	 
	}




