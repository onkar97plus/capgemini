package com.cg.mylabass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab72 {

	public static void main(String[] args) {
		List<String> a1=new ArrayList<String>();
		a1.add("harvey");
		a1.add("pearson");
		a1.add("jessica");
		a1.add("specter");
		System.out.println("Before Sorting:");
		for(String count: a1)
		{
			System.out.println(count);
		}
		
		Collections.sort(a1);
		
		System.out.println("After Sorting");
		for(String count: a1)
		{
			System.out.println(count);
		}
	}

}
