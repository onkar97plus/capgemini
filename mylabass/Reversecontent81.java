package com.cg.mylabass;
import java.io.*;

	public class Reversecontent81 
	{
			public static void main(String[] args)
			{
	 
				try(FileReader str=new FileReader("C:\\Users\\NVATTIKO\\Desktop\\Java\\1.txt"))
	 
				{
					StringBuffer sb=new StringBuffer();
				int i=0;
	 
				while((i=str.read())!=-1)
				{
	 
					sb.append((char)i);
				}
				sb.reverse();
				String h  = sb.toString();
				System.out.print(h);
				str.close();
	 
				FileWriter obj=new FileWriter("C:\\Users\\NVATTIKO\\Desktop\\Java\\1.txt");
	 
					obj.write(h);
					obj.close();
				}
	 
				catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	}


