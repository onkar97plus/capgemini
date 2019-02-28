package com.cg.mylabass;

import static org.junit.Assert.*;

import org.junit.Test;
 
public class Person91test 
{
 
 
	@Test
	public void testGetFullName()
	{
		System.out.println("from TestPerson2");
		Person91 per = new Person91("Robert","King");
		assertEquals("Robert King",per.getFullName());
		}
		@SuppressWarnings("unused")
		@Test (expected=IllegalArgumentException.class)
		public void testNullsInName()
		{
		System.out.println("from TestPerson2 testing exceptions");
		Person91 per1 = new Person91(null,null);
		}
		}
