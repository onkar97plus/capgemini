package com.cg.mynew;

class Threaduse implements Runnable{
	
	public void run() {
		System.out.println("hello");
	}
}

public class Hellorunnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Threaduse hello=new Threaduse();
		Thread abc=new Thread(hello);
		
		abc.start();
	}

}                                                         