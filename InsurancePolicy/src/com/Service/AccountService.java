package com.Service;

import com.Bean.AccountBean;
import com.DAO.AccountDAO;

public class AccountService 
{
 public int addStudentService(String insured_name,String insured_street,String insured_city,String insured_state,long insured_zip,String business_segment,int account_number,String username)
 {
	
	 
	 AccountDAO bookDAO = new  AccountDAO();
	 AccountBean studentBean = new AccountBean();
	 //wrap up all the four field values into bean
	 
	 studentBean.setInsured_name(insured_name);
	 studentBean.setInsured_street(insured_street);
	 studentBean.setInsured_city(insured_city);
	 studentBean.setInsured_state(insured_state);
	 studentBean.setInsured_zip(insured_zip);
	 studentBean.setBusiness_segment(business_segment);
	
	 studentBean.setAccount_number(account_number);
	 studentBean.setUsername(username);
	 int updateResult = 0;
	 try
	 {
		 updateResult = AccountDAO.addStudent(studentBean);
		 return updateResult;
	 }
	 catch(Exception ex)
	 {
		 System.out.println(ex.toString());
		 return 0;
	 }
 }
 
 
 
 
}
