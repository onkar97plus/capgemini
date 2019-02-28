package com.cg.mylabass;

import java.io.*;
import java.util.*;
class HashsetDemo
{
		public static void main(String args[]) throws IOException
		{
			// create a hash set
			Set<String> hs = new HashSet<String>();
			// add elements to the hash set
			hs.add("B");
			hs.add("A");
			hs.add("D");
			hs.add("E");
			hs.add("C");
			hs.add("F");
			//System.out.println(hs);
			Iterator it=hs.iterator();
 
			FileWriter hs1=new FileWriter("out11.txt");
			BufferedWriter h1=new BufferedWriter(hs1);
			while(it.hasNext())
			{
			//System.out.println(it.next());
				h1.write((String) it.next());
			h1.newLine();	
			}	
			h1.close();
 
		}
	}