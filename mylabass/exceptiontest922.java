package com.cg.mylabass;

import static org.junit.Assert.*;

import org.junit.Test;
 
 
@SuppressWarnings("unused")
public class exceptiontest922
{
 
	@Test(expected=Employeeexception63.class)
	public void test() throws Employeeexception63
	{
		Employeeexception63.handle(100);
	}
 
}
