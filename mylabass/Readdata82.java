package com.cg.mylabass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readdata82
{
	public static void main(String[] args) throws FileNotFoundException
	{
		int i;
		File file=new File("C:\\Users\\NVATTIKO\\Desktop\\Java\\even.txt");
		Scanner scan=new Scanner(file);
		Scanner sc=scan.useDelimiter(",");
		System.out.println("displaying even numbers");
		while(sc.hasNext())
		{
			i=sc.nextInt();
			if(i%2==0)
			{
 
 
				System.out.println(i);
			}
		}
		scan.close();
	} 
 
 
}


