package com.cg.mylabass;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
 
public class TestFile
{
	public static void main(String args[])
	{
		byte b[]=new byte[13];
		try
		{
			System.out.println("Enter text in file:");
			System.in.read(b);
			FileOutputStream fout=new FileOutputStream("text3.txt",true);
			BufferedOutputStream br=new BufferedOutputStream(fout);
			br.write(b);
 
			fout.write(b);
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
