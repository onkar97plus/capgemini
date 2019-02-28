package com.cg.mylabass;

public class SavingsAccount extends Account53{
	final float minimumbal=500;
	SavingsAccount(String name,float age,double balance)
	{
	super(name,age,balance);
	}
	boolean withdraw(double amount)
	{
	if(this.balance-amount>500)
	this.balance-=amount;
	else System.out.println(this.accholder.getname()+"minimum balance of 500 must be there");
	System.out.println("your current balance is"+this.getBalance());
	return false;
	}

}
