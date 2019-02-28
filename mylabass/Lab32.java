package com.cg.mylabass;

import java.util.Arrays;
import java.util.Scanner;

public class Lab32 {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.nextLine();
		char ch[]=str.toCharArray();
		char os[]=str.toCharArray();
		Arrays.sort(ch);
		
		boolean res=Arrays.equals(ch,os);
		
		if(res==true)
		{
			System.out.println("Positve String");
		}
		else
			System.out.println("Negative String");
	sc.close();
	}

}
