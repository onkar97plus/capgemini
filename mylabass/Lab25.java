package com.cg.mylabass;

import java.util.Scanner;

public class Lab25 {
	enum Gender{M,F}
	String firstName,lastName;
    int num;
	
	public Lab25(String a,String b)
	{
		firstName=a;
		lastName=b;
	}
	
	public String getName()
	{
		return firstName;
	}
	
	public void setName(String a)
	{
		firstName=a;
	}
	
	public String getsName()
	{
		return lastName;
	}
	
	public void setsName(String b)
	{
		lastName=b;
	}
	
	public void setphone()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter phone number: ");
		num=sc.nextInt();
		sc.close();
	}
	
	public static void main(String args[])
	{
		int count=0;
		char gender='M';
		Lab25 obj;
		obj=new Lab25("Harvey","Specter");
		obj.setphone();
		String s=Character.toString(gender);
		
		for(Gender ge : Gender.values()) {
			if(ge.toString().equals(s)) {
				count++;
			}
		}
		System.out.println("First Name: "+obj.getName()+ 
				"\nLast Name: "+obj.getsName()+
				" \nPhone: "+obj.num);
		if(count!=0)
			System.out.println("Gender:" +gender);
		else
			System.out.println("invalid");
		
	}
}
