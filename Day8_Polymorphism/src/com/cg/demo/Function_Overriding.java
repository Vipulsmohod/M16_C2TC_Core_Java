package com.cg.demo;
class Android 
{
	void display()
	{
		System.out.println("Realme");
	}	
}
class Apple extends  Android{
	void display()
	{
		System.out.println("I Phone  12 Pro max");
	}
}
class Samsung extends Android
{
	void display()
	{
		System.out.println("Samsung ");
	}
	
}

public class Function_Overriding
{
	

	public static void main(String[] args) 
	{
		Apple a1=new Apple();
		Android a=new Android();
		Samsung a2=new Samsung();
		a1.display();
	     a2.display();
		a.display();
	}

}
