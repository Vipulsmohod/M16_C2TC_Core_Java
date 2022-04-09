package com.cg.model;

import java.util.Scanner;

public class Example5Char 
{
	public static void main(String[] args) 
	{
		 char c='x';
		 System.out.println(c);
		 System.out.println("=============================");
		  Scanner sc=new Scanner(System.in);
		   System.out.println("Enter Any Char Value ");
		   char c1=sc.next().charAt(0);
		   System.out.println("Your Value Is "+c1);
		   
		
	}

}
