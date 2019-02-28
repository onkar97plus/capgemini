package com.cg.mylabass;

import java.time.LocalDate;
import java.time.Month;
import java.time.*;
public class Lab33 {
	
	public static void main(String[] args) {
		LocalDate tdy=LocalDate.now();
		System.out.println("Present date:" +tdy);
		LocalDate end =LocalDate.of(1997, Month.JULY, 8);
		System.out.println("comparing date :" +end);
		Period period=tdy.until(end);
		System.out.println("Days"+period.getDays());
		System.out.println("Months"+period.getMonths());
		System.out.println("Years"+period.getYears());
		
	}

}
