package com.cg.mylabass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

	@Test
	void testDay() 
	{
		Date obj=new Date(12,12,2012);
		assertEquals(12,obj.getDay());
	}
	void testMonth() 
	{
		Date obj=new Date(12,12,2012);
		assertEquals(12,obj.getMonth());
	}
	void testYear() 
	{
		Date obj=new Date(12,12,2012);
		assertEquals(2012,obj.getYear());
	}

}
