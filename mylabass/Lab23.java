package com.cg.mylabass;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.*;
public class Lab23 {
			String firstName,lastName;
		    char gender;
		    int num;
			
			public Lab23(String a,String b, char g)
			{
				firstName=a;
				lastName=b;
				gender=g;
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
			
			public char getgend()
			{
				return gender;
			}
			
			public void setGender(char g)
			{
				gender=g;
			}
			
			public void setphone()
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter phone number: ");
				num=sc.nextInt();
				sc.close();
			}
			
			static int a;
			public void CalAge(){
					LocalDate a=LocalDate.of(1998, Month.JANUARY,2);
					LocalDate a1=LocalDate.now();
					Period p=a.until(a1);
					System.out.println("Age: "+p.getYears());

			}
			
			public String FullName(String firstname, String lastname)
			{
				return firstname+lastname;
			}
			public static void main(String args[])
			{
				Lab23 obj;
				obj=new Lab23("Harvey","Specter",'M');
				obj.setphone();
				System.out.println("First Name: "+obj.getName()+ 
						"\nLast Name: "+obj.getsName()+"\nGender: "+obj.getgend()+
						" \nPhone: "+obj.num);
				obj.CalAge();
				
				System.out.println(obj.FullName("Full Name: "+ "56Harvey","Specter"));
				
				
				
			}
}

