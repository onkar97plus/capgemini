package com.cg.mynew;
import java.util.*;


public class EnumUse {

	public enum Months{
		JANUARY,FEBRUARY,MARCH,APRIL;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		s=sc.nextLine();
		int count=0;
		for(Months m : Months.values())
		{
			if(m.toString().equals(s))
			{
				count++;
			}
		}
		if(count!=0)
			System.out.println("Correct");
		else
			System.out.println("InCorrect");
		sc.close();
	}

}
