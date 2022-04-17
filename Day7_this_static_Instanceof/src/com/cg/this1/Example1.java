package com.cg.this1;

	class Parent
	{
		int a;
	void print(int a)
		{
		 this.a=a;
			
		}
		void display()
		{
			System.out.println("This Value Of a"+a);
		}
		
	}
	

public class Example1 
{
	public static void main(String[] args) {
		
		 Parent p=new Parent();
		  p.display();
		  p.print(10);
	}

}
