package com.cg.mylabass;

public abstract class Account53 {
	long accnum;
	double balance;
	Person1 accholder;
	void deposit(double amount) {
		this.balance+=amount;
	}
	abstract boolean withdraw(double amount);
	double getBalance(){
		return this.balance;
	}
	public String toString(){
		return String.format("name:"+this.accholder.getname()+"balance:"+this.getBalance());
	}
	public static void main(String args[])
	{
		Account53 acc1=new SavingsAccount("smith",25,2000);
		Account53 acc2=new CurrentAccount("kathy",30,3000);
		acc1.withdraw(2000);
		acc2.withdraw(21000);
		System.out.println(acc1);
		System.out.println(acc2);
	}
	Account53(String name,float age,double balance)
	{
		this.accholder=new Person1();
		this.accholder.setname(name);
		this.accholder.setage(age);
		this.balance=balance;
		this.accnum=(long)(Math.random()*1000000);
	}
}

