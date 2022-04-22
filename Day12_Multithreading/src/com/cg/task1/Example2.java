package com.cg.task1;

class A extends Thread
{
	public void run()
	{
		System.out.println("Thread is running");
	}
}
public class Example2  {

	public static void main(String[] args)
	{
		A obj=new A();
		obj.start();
		obj.start();

	}

}