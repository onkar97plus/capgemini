package com.cg.mylabass;

import static org.junit.Assert.*;

import org.junit.Test;

 
public class TestPerson921
{
	Person p = new Person();
	@Test
	public void testgetfirstname() {
		System.out.println("first name");	
		assertEquals("venkatesh",p.getFirstName());
	}
	@Test
	public void testgetlastname() {
		System.out.println("last name");
		assertEquals("surampally",p.getLastName());
	}
}
