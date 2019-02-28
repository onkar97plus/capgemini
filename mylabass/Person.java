package com.cg.mylabass;
import java.util.*;
class Account{
	Scanner sc=new Scanner(System.in);
	private long accNum;
	private double balance;
	
	public long getAccNum()
	{
		return accNum;
	}
	
	public void setAccNum(long accNum)
	{
		this.accNum=accNum;
	}
	
	public void Deposit(double money)
	{
		balance=balance+money;
		System.out.println("Balance is:" +balance);
	}
	
	public void Withdraw(double money)	
	{
		balance=balance-money;
		System.out.println("Balance is:" +balance);
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	public double GetBalance()
	{
		return balance;
	}
	
	public String toString()
	{
		return "Account[balance=" +balance+ "]";
	}
}
public class Person extends Account{
	String name;
	float age;
	
	public String GetName() {
		return name;
	}
	public float GetAge()
	{
		return age;
	}
	
	public void SetDetails(String name,float age)
	{
		this.name=name;
		this.age=age;
	}
	
	public String toString()
	{
		return "Person name=" +name+", Balance="+GetBalance();
	}

	public static void main(String[] args) {
		int acc=100;
		Person smith=new Person();
		Person kathy=new Person();
		smith.SetDetails("smith",24);
		smith.Deposit(2000);
		smith.setBalance(2000);
		smith.setAccNum(acc++);
		smith.GetBalance();
		
		kathy.SetDetails("smith",24);
		kathy.Deposit(2000);
		kathy.setBalance(2000);
		kathy.setAccNum(acc++);
		kathy.GetBalance();
		
	}

}
