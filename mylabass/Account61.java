package com.cg.mylabass;

public class Account61 {
		  
		   long accnum;
		   double balance;
		   person acchold;

		   void deposit(double amount)
		   {
			   this.balance+=amount;
		   }

			boolean withdraw(double amount) {
				return false;
			}
			double getbalance()
			{
				return this.balance;

			}
			public String toString()
			{
				return String.format("name :"+this.acchold.getName()+"balance"+this.getbalance());

			}
			public static void main(String[] args)
			{
				Account61 acc1;
				Account61 acc2;
				try {
					 acc1=new CurrentAccount("smith",25,5000);
					acc1.deposit(2000);
					System.out.println(acc1);
				}
				catch(Invalid e)
				{
					System.out.println(e.getMessage()+"not eligible to create account");
				}
				try {
					 acc2=new SavingsAccount1("kathy",35,5000);
					acc2.withdraw(2000);
					System.out.println(acc2);
				}
				catch(Invalid e)
				{
					System.out.println(e.getMessage()+"not eligible to create account");
				}
			}
			Account61(String name,float age,double balance)
			{
				this.acchold=new person();
				this.acchold.setName(name);
				this.acchold.setAge(age);
				this.balance=balance;
				this.accnum=(long)(Math.random()*1000000);

			}
		}
		class person
		{
			private String name;
			private float age;

			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public void setAge(float age) {
				this.age = age;
			}
			public float getAge() {
				return age;
			}

		}

		class CurrentAccount extends Account61
		{
		  final float overdraftLimit=-500;
		  public static void main(String[] args)
		  {
			  Account61 acc1=new CurrentAccount("kathy",35,5000);
			  acc1.withdraw(2000);
			  System.out.println(acc1.getbalance());

		  }
		  CurrentAccount(String name,float age,double balance)
		  {
			  super(name,age,balance);

		  }
		  boolean withdraw(double amt)
		  {if(this.balance-amt>overdraftLimit)
		  {
			  this.balance-=amt;
			  return true;
		  }
		  else
			  {System.out.println(this.acchold.getName()+"overdraftLimit exceed");
		     return false;


		  }

		}
		}
		class SavingsAccount1 extends Account61
		{
		  final float minimum=500;
		  public static void main(String[] args)
		  {
			  Account61 acc2=new SavingsAccount1("smith",25,5000);
			  acc2.withdraw(2000);


		  }
		 SavingsAccount1(String name,float age,double balance)
		  {
			  super(name,age,balance);

		  }

		  boolean withdraw(double amt)
		  {if(this.balance-amt>minimum)
		  {
			  this.balance-=amt;
			  return true;
		  }
		  else System.out.println(this.acchold.getName()+"minimum balance 500");
		  System.out.println("your balance is " +this.getbalance());
		     return false;


		  }




	}
		class Invalid extends RuntimeException
		{
			Invalid(String s)
			{
				super(s);
	}
		}

