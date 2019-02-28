package com.cg.mylabass;

import java.util.Scanner;

public class SavingLab extends AccountLab4 {
	final double minimumBalance=1000;
	
		void withdraw()
		{
			double balance=15000;
			Scanner s=new Scanner(System.in);
			System.out.println("minimum balance "+minimumBalance+"\n"+"Enter withdraw amount:");
			int wt=s.nextInt();
			System.out.println("withdraw: "+wt);
			if((balance-wt)>minimumBalance)
			{
				double minimumBalance=balance-wt;
				System.out.println("\n final withdraw:"+(balance-wt));
			}
			else
			{
				System.out.println("insufficient balance");
			}
			
		}
		public static void main(String[] args) {
			try {
				AccountLab4 obj=new SavingLab();
				obj.withdraw();
			} catch(Exception e)
			{
				System.out.println("Error");
			}

	}

}
