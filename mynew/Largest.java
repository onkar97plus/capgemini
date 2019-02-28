package com.cg.mynew;
import java.util.*;
public class Largest {
	public void Array(int ar[])
	{
		int largest,minimum;
		largest=ar[0];
		for(int i=1;i<5;i++)
		{
			if(ar[i]>largest)
			{
				largest=ar[i];
			}	
		}
		minimum=ar[0];
		System.out.println("Largest number is:" +largest);
		for(int i=1;i<5;i++)
		{
			if(ar[i]<minimum)
			{
				minimum=ar[i];
			}	
		}
		System.out.println("Smallest number is:" +minimum);
	}

	public static void main(String[] args) {
		int ar[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements");
		for(int i=0;i<5;i++)
		{
			ar[i]=sc.nextInt();
		}
		Largest lg=new Largest();
		lg.Array(ar);
		sc.close();
	}

}
