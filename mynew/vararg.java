package com.cg.mynew;

public class vararg {
	static void print(int a,int y, String...s)
	{
		System.out.println(a+" "+y);
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]+"\t");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(3,2,"java","java");
		System.out.println();
		System.out.println("next invoke");
		print(1,2,"a","b","c","d");

	}

}
