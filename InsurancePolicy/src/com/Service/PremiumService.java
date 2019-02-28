package com.Service;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import com.DAO.PremiumDao;



public class PremiumService {
	public int CalculatePremium(HashMap<String, String> ans) {
		// TODO Auto-generated method stub
		PremiumDao predao=new PremiumDao();
		int res=predao.CalDao(ans); 
		
	
		
		return res;

}
}
