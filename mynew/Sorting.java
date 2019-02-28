package com.cg.mynew;
import java.util.*;
public class Sorting {

	public static void main(String[] args) {
		int ar[]={4,5,9,7,8};
		/*int cp[]=Arrays.copyOfRange(ar,1,3);
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(cp[i]);
		}*/
		Arrays.sort(ar);
		System.out.println("Sorted array is: ");
		for(int number: ar)
		{
			System.out.print(number+" ");
		}
	}

}
