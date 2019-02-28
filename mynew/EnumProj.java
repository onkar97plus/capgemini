package com.cg.mynew;

import java.util.Scanner;

public class EnumProj {
		public enum Gender{
			M,F
		}

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			char c;
			c=sc.next().charAt(0);
			int count=0;
			for(Gender g : Gender.values())
			{
				if(g.equals(c))
				{
					count++;
				}
			}
			if(count!=0)
				System.out.println("Correct");
			else
				System.out.println("InCorrect");
			//sc.close();
		}

	}
