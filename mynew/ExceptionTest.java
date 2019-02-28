package com.cg.mynew;

import java.util.Scanner;

public class ExceptionTest extends Exception{
	public String toString() {
		return "Cannot Be Withdrawn";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int with;
		System.out.println("enter the amount to withdraw");
		with=sc.nextInt();
		try
		{
			if(with>=1000)
			{
				throw new ExceptionTest();
			}
			else
				System.out.println("Successfull");
		}
		catch(ExceptionTest a)
		{
			System.out.println(a);
		}
		
	}

}
