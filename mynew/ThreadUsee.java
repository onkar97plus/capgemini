package com.cg.mynew;

public class ThreadUsee extends Thread{
	
	public void run()
	{
		System.out.println("this is threads");
	}
	public static void main(String args[])
	{
		ThreadUsee abc=new ThreadUsee();
		abc.start();
	}
}
