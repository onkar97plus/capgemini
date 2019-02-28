package com.cg.mylabass;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class lab34 {

	public static void main(String[] args) {
		LocalDate tdy=LocalDate.now();
		System.out.println("Present date:" +tdy);
		LocalDate end =LocalDate.of(1997, Month.JULY, 8);
		LocalDate mid =LocalDate.of(1998, Month.JULY, 7);
		System.out.println("comparing date from :" +end);
		System.out.println("To :" +mid);
		Period period=end.until(mid);
		System.out.println("Days"+period.getDays());
		System.out.println("Months"+period.getMonths());
		System.out.println("Years"+period.getYears());

	}
}
