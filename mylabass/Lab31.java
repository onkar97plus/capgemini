package com.cg.mylabass;
import java.util.*;
public class Lab31 {
		public void accept() {
		String word;
		StringBuilder sb=new StringBuilder();
		int choice;
		System.out.println("Enter the string: ");
		Scanner sc=new Scanner(System.in);
		word=sc.nextLine();
		System.out.println("Enter choice: ");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1: sb.append(word).append(word);
				String result=sb.toString();
				System.out.println(result);
				break;
				
		case 2: char[] ch=word.toCharArray();
				for(int i=1;i<ch.length;i+=2)
				{
					ch[i]='#';
				}
				System.out.println(ch);
				break;
				
		case 3: char[] ch1=word.toCharArray();
				for (char ab : ch1 ) {
	           	if (sb.indexOf(String.valueOf(ab)) != -1)
	            continue;
	           	else
	            sb.append(ab);
				}
				System.out.println(sb);
				break;
				
		case 4: String s="";
				for(int i=0;i<word.length();i++)
				{
					char c=word.charAt(i);
					if(i%2==0) 
					c=Character.toUpperCase(c);
					s=s+c;
				}
				System.out.println(s);
				break;
				
		default: System.out.println("Please enter valid choice: ");
		}
		
		sc.close();
		}

	public static void main(String[] args) {
		Lab31 obj=new Lab31();
		obj.accept();
	}

}
