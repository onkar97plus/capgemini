package com.cg.mylabass;

public class Person91
{
	private String firstName;
	private String lastName;
	public Person91(String fname,String lname)
	{
	if(fname == null &&lname==null){
	throw new IllegalArgumentException("Both Names Cannot be NULL");
	}
	this.firstName=fname;
	this.lastName = lname;
	}
	public String getFullName()
	{
	String first=(this.firstName != null)? this.firstName:"?";
	String last=(this.lastName != null)? this.lastName:"?";
	return first + " " + last;
}
 
public String getFirstName(){
return this.firstName;
}
public String getLastName(){
return this.lastName;
}
public static void main(String args[])
{
Person91 p=new Person91("a","b");
System.out.println(p.getFirstName());
}
}
