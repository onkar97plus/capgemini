package com.cg.mylabass;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.Temporal;

public class Lab35 {
	public void PurchaseDate()
	{
		LocalDate purd =LocalDate.of(2018, Month.JULY, 1);
		System.out.println("Purchase Date is: "+purd);
		Period warr=Period.of(1,0,0);
		Temporal temp = warr.addTo(purd);
		System.out.println("Expiry Date is: "+temp);
	}

	public static void main(String[] args) {
		Lab35 obj=new Lab35();
		obj.PurchaseDate();

	}

}
