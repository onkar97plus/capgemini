package com.cg.mylabass;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
 
public class TestFiles
{
	public static void main(String args[])
	{
		//byte b[]=new byte[13];
		String b=" ";
		try
		{
			System.out.println("Enter text in file:");
			//System.in.read(b);
			//FileOutputStream fout=new FileOutputStream("text3.txt",true);
			//BufferedOutputStream br=new BufferedOutputStream(fout);
			Scanner sc=new Scanner(System.in);
			FileOutputStream fout=new FileOutputStream("text3.txt",true);
			b=sc.nextLine();
			fout.write(b.getBytes());
			fout.write("\r\n ".getBytes());
			fout.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			//fout.close();
		}
	}
 
}