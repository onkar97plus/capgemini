package com.cg.mylabass;

public class Date {
	
	int intDay, intMonth, intYear;
	
	Date(int intDay, int intMonth, int intYear)  	{
		this.intDay = intDay;
		this.intMonth = intMonth;
		this.intYear = intYear;
	}
	
	void setDay(int intDay)	
	{
		this.intDay = intDay;
	}
		int getDay( )		
	{
		return  this.intDay;
	}
	
	void setMonth(int intMonth)
	{
		this.intMonth = intMonth;
	}

	int getMonth( )
	{
		return  this.intMonth;
	}

	void setYear(int intYear)
	{
		this.intYear=intYear;
	}
	
	int getYear()
	{
		return  this.intYear;
	}
	
	public String toString()   
	{
		return	"Date is:" +intDay+"/"+intMonth+"/"+intYear; 
	}
	
	

	}


