package com.cg.mylabass;

class except extends Exception
{
	public String toString()
	{
		return "name cant be filled blank";
	}

}

enum Gender{
	M(1),F(2);
	Gender(int gen)
	{
		this.gen=gen;
	}
	private int gen;
	public int getgen()
	{
		return gen;
	}
	void setgen(int gen)
	{
		this.gen=gen;
	}
}

public class Lab61{
	public int flag=1;
	public String fname;
	public String lname;
	public int gen;
	public String ph;
	public Lab61(String f, String l, int i, String d)
	{
		String a=" ";
		try
		{
			if(f.equals(a))
			{
				throw new except();
			}
			else
			{
				fname=f;
				flag=0;
			}
			if(l.equals(a))
			{
				flag=0;
				throw new except();
			}
			else
			{
				lname=l;
				fname=f;
				lname=l;
				gen=i;
				ph=d;
				flag=0;
			}
		}
		catch(except e)
		{
			System.out.println(e);
		}
	}
	
	public String getph()
	{
		return ph;
	}
	public void setph()
	{
		this.ph=ph;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname=fname;
	}
	public String getLanme() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname=lname;
	}
	public int getGen() {
		return gen;
	}
	public void setGen(int gen) {
		this.gen=gen;
	}
	void display()
	{
		if(flag==1)
			System.out.println("Person details:\n____________\n\nFirst Name");
	}

	public static void main(String[] args) {
		Lab61 ob=new Lab61("Harvey"," ",Gender.M.getgen(),"9595607989");
		ob.display();
	}

}

