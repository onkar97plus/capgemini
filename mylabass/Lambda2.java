package com.cg.mylabass;

import java.util.function.Consumer;

public class Lambda2
{
	public static void main(String[] args)
	{
		Consumer<String> c=(String str)->System.out.println(String.valueOf(str).replaceAll(".", "$0  "));
		c.accept("Hello");
 
 
	}
 
 
}