package com.cg.mylabass;

public class Services implements EmployeeServices{
	public char scheme(int salary,String designation)
	{
	if(salary>5000 && salary<20000 &&designation.equalsIgnoreCase("system_associate"))
	{
	return 'C';
	}
 
	else if(salary>=20000 && salary<40000 &&designation.equalsIgnoreCase("programmer"))
	{
	return 'B';
	}
	else if(salary>=40000 &&designation.equalsIgnoreCase("manager"))
	{
	return 'A';
	}
	else if(salary<5000 &&designation.equalsIgnoreCase("clerk"))
	{
	return 'O';
	}
	else
	{
	return 'p';
	}
	}
	} 
