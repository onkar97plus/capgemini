package com.cg.mynew;

public class ArrayUse {

	public static void main(String[] args) {
		int ar[][]=new int[5][5];
		int i,j,k=0;

		for(i=0;i<5;i++)
		{
			for(j=0;j<i+1;j++)
			{
				ar[i][j]=k;
				k++;
			}
		}
		
		for(i=0;i<5;i++)
		{
			for(j=0;j<i+1;j++)
			{
				System.out.print(ar[i][j]+" ");
				System.out.println();
			}
		}

	}

}
