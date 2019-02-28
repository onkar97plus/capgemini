package com.cg.mylabass;

import java.util.Arrays;

public class Lab71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str=new String[4];
		str[0]="Pearson";
		str[1]="Jessica";
		str[2]="Specter";
		str[3]="Harvey";
		System.out.println("Before Sorting"+Arrays.toString(str));
		Arrays.sort(str);
		System.out.println("After Sorting"+Arrays.toString(str));
	}

}
