package com.cg.mylabass;

public class CurrentAccount extends Account53{
	final float overdraftLimit=-500;
	CurrentAccount(String name,float age,double balance)
	{
		super(name,age,balance);
	}
	boolean withdraw(double amount)
	{
		if(this.balance-amount>overdraftLimit)
		{
			this.balance-=amount;
			return true;
		}
		else
			System.out.println(this.accholder.getname()+"overdraft limit exceeded");
	return false;
	}

}
