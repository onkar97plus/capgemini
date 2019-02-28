package com.cg.mynew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SleepDemo {

	public static void main(String[] args) {
			
		List<String> seasonlist=new ArrayList<String>();
		seasonlist=Arrays.asList(new String[]{
			"Winter",
			"Summer",
			"Spring",
			"Autumn"
		});
		
		for(String value: seasonlist) {
			try {
				Thread.sleep(4000);
			} catch (InterruptedException exp) {
				System.err.println(exp.getMessage());
			}
			System.out.println(value);
		}

	}

}
