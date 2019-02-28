package com.cg.mylabass;

import java.util.Scanner;

public class AccountLab4 {
	
	void withdraw() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		if(age<15)
		{
			throw new Exception("u r a child");
		}
			System.out.println("enter minimum balance");
			int b=sc.nextInt();
			System.out.println("enter withdraw amount");
			int wt=sc.nextInt();
			
			if(b>10000)
			{
				System.out.println("withdraw:"+(b-wt));
			}
			else
				System.out.println("insufficient balance");
		}
	void withdrawl()
	{
		double overdraftlimit=10000; 
		System.out.println("overdraftLimit: "+overdraftlimit+"\n");
	}
	
	}

