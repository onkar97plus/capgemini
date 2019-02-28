package com.cg.mynew;

class Threadd implements Runnable{        //extends Thread
	public void run() {
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Child thread: " +i);
				Thread.sleep(600);
			}
		} catch(InterruptedException e) {
			System.out.println("child Interrupted");
		}
		System.out.println("Exiting child thread");
	}
}

	public class NewThread{
	public static void main(String[] args) {
		
		Threadd t=new Threadd();
		Thread t1=new Thread(t); //
		t1.setName("Demo Thread");   //t.setName();
		System.out.println("child thread: "+t);
		t1.start();                 //t.start();
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Main Thread: "+i);
				Thread.sleep(300);
			}
		} catch(InterruptedException e) {
			System.err.println(e);
		}
		
	}

}
