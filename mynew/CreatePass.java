package com.cg.mynew;
import java.util.*;

class Pass extends Exception{
	public String toString()
	{
		return "enter correct password";
	}
}
public class CreatePass {

	public static void main(String[] args) {
		for(int i=0;i<3;i++)
		{
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
			try
			{
				if(!s.equals("hello"))
				{
					throw new Pass();
				}
				else
					System.out.println("Correct password");
			break;
		}
			
		catch(Pass p)
		{
			System.out.println(p);
		}

	}
	}
}

