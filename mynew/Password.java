package com.cg.mynew;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Password {

	public static void main(String[] args) {
		System.out.println("enter password");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    String pass = null;
		try {
			pass = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Check_Password ch=new Check_Password();
		ch.isCorrectPassword(pass);
		
	}

	public Object pass;	
	}
	
	class Password_Exception extends Exception{
		
		public String toString() {
			return "Enter correct password";
		}
	}
	
	class Check_Password{
		public void isCorrectPassword(String Password)
		{
				
			}
			
		}


