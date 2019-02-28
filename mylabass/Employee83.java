package com.cg.mylabass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

@SuppressWarnings("serial")
public class Employee83 extends UserInputt {
		public Employee83(String name, int id) {
		
 
	}
 
		public static void main(String args[]) 
		{
			try {
				UserInputt obj=new Employee83(null,0);
				Scanner scan=new Scanner(System.in);
				System.out.print("Enter the emp-id: ");
				obj.id=scan.nextInt();
				System.out.print("Enter the emp-name: ");
				obj.name=scan.next();
				System.out.print("Enter the emp-salary: ");
				obj.salary=scan.nextInt();
				double sal= obj.salary;

				System.out.print("Enter the emp-designation: ");
				obj.designation=scan.next();
 
				scan.close();
				FileOutputStream fout=new FileOutputStream("3.txt");
				ObjectOutputStream out=new ObjectOutputStream(fout);
				out.writeObject(obj);
				out.flush();
				out.close();
				System.out.println("success");
				ObjectInputStream in=new ObjectInputStream(new FileInputStream("3.txt"));
				Employee83 s=(Employee83) in.readObject();
				System.out.println("\nEmp Id: "+s.id+"\nEmpname: "+s.name+"\nEmp salary "+s.salary+"\nEmp designation: "+s.designation);
				in.close();
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
 
	}
 
}


