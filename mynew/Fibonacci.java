package com.cg.mynew;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=0;
		int s=1;
		int temp;
		System.out.println(f);
		System.out.println(s);
		for(int i=0;i<10;i++)
		{
			temp=f+s;
			System.out.println(temp);
			f=s;
			s=temp;
		}
		
	}

}
