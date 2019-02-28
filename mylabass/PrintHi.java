package com.cg.mylabass;

import java.util.Timer;
import java.util.TimerTask;
 
class PrintH extends TimerTask 
{
 
public void run()
{
 
System.out.println("Hey!");
 
}
 
}
class PrintHi
{
	public static void main(String args[])
 
	{
 
 
Timer timer = new Timer();
 
timer.schedule(new PrintH(), 0, 100);
 
}}
