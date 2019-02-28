package com.cg.mylabass;
import java.io.Serializable;
public abstract class Employee extends Services
implements Serializable {
	public int id,salary;
	public String name,designation;
	public char insuranceScheme;
}


