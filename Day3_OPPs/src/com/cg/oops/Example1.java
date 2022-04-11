package com.cg.oops;

public class Example1 
{
	String name;
	public Example1(String name) 
	{

		this.name=name;
	}
	void display()
	{
		System.out.println("This is "+name);
	}
	public static void main(String[] args) 
	{
		Example1 e=new Example1("Audi");
		Example1 e1=new Example1("BMW");
		Example1 e2=new Example1("Mercedes-Benz");
		
		 e.display();
		 e1.display();
		 e2.display();
		
		
	}
}
