package com.cg.oops;

public class Assignment {
  
	int id;
	String name;
	public Assignment(String name) 
	{
		this.name=name;
		System.out.println(" Parameterised Constructor ");
		
	}
	void m1()
	{
		System.out.println("Name is "+name);
	}
	

	public Assignment(int id) 
	{
		this.id=id;
		System.out.println(" Simple Constructor ");
		
	}
	void m2() 
	{
		System.out.println(" Id is "+id);
	}

	public static void main(String[] args)
	{
		  Assignment a=new Assignment(1);
		  Assignment a1=new Assignment("Vipul");
		           a1.m1();
		           a.m2();
		
	}

}
