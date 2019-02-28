package com.cg.mynew;

public class Custom2 {
		
		static int getAge() {
			return -10;
		}
	public static void main(String[] args) {
	int age=getAge();
	try
	{
		if(age<0)
			throw new ExceptionUse();
		else
			System.out.println("Age entered is" +age);
	}
	catch(ExceptionUse e)
	{
		System.out.println(e);
	}
	}
}
