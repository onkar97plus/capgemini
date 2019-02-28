package com.cg.mylabass;

import java.util.Scanner;

public class Userinput extends Employee {
	 
		public static void main(String[] args) {
	 
			Userinput ul=new Userinput();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter name:");
			ul.name=sc.nextLine();
			System.out.println("enter id:");
			ul.id=sc.nextInt();
			System.out.println("enter salary:");
			ul.salary=sc.nextInt();
			System.out.println("enter designation:");
			ul.designation=sc.next();
			ul.insuranceScheme=ul.scheme(ul.salary,ul.designation);
			sc.close();
			ul.details();
		}
			void details()
			{
			System.out.println("name:"+this.name+"\nid:"+this.id+"\nsalary:"+this.salary+
					"\ndesignation:"+this.designation+"\ninsurance scheme:"+this.insuranceScheme);
			if(this.insuranceScheme=='0')
			System.out.println("no scheme");
			else if(this.insuranceScheme=='p')
			System.out.println("enter correct details");
			else
			System.out.println("scheme"+this.insuranceScheme);
			}
	 
	 
	 
	}


