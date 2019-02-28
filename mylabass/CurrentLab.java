package com.cg.mylabass;

import java.util.Scanner;

public class CurrentLab extends AccountLab4 {
	double overdraftLimit;
	void withdraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("withdraw amount");
		
		int withdraw=sc.nextInt();
		System.out.println("withdraw:"+withdraw+"\n");
		if(overdraftLimit==withdraw)
		{
			System.out.println(true+"\n");
		}
		else
		{
			System.out.println(false+"\n");
		}
	}

	public static void main(String[] args) throws Exception {
		try {
			AccountLab4 obj=new AccountLab4();
			obj.withdraw();
		}catch (Exception e)
		{
			System.out.println("Error");
		}
		

	}

}
