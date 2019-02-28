package com.cg.mylabass;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Lab37a {
	static int a;
	void CalAge(){
			LocalDate a=LocalDate.of(1998, Month.JANUARY,2);
			LocalDate a1=LocalDate.now();
			System.out.println(a);
			System.out.println(a1);
			Period p=a.until(a1);
			System.out.println("Age: "+p.getYears());

	}
	public static void main(String[] args) {
		Lab37a obj=new Lab37a();
		obj.CalAge();
		
	}

}
