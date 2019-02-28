package com.cg.mynew;

import java.util.Scanner;

public class Student {
	int id;
	String name;
	public void accept()
	{
		Scanner b=new Scanner(System.in);
		Scanner c=new Scanner(System.in);
		id=b.nextInt();
		name=c.nextLine();
	}
	
	public void Display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud[]=new Student[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter details");
		for(int i=0;i<3;i++)
		{
			stud[i]=new Student();
			stud[i].accept();
		}
		
		for(int i=0;i<3;i++)
		{
			stud[i].Display();
		}
	}

}
