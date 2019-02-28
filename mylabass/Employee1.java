package com.cg.mylabass;

import java.io.Serializable;

public abstract class Employee1 extends Services1
implements Serializable {
	public int id,salary;
	public String name,designation;
	public char insuranceScheme;
}
