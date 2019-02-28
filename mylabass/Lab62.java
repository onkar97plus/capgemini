package com.cg.mylabass;
import java.util.Scanner;
public class Lab62 extends Exception{
	public String toString() {
		return "Under Age";
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.println("Enter age: ");
		age=sc.nextInt();
		try
		{
			if(age<15)
			{
				throw new Lab62();
			}
			else
			{
				System.out.println("Age is ok");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
