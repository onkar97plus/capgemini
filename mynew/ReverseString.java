package com.cg.mynew;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}
		
		
	}

}
