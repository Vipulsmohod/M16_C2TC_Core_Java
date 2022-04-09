package com.cg.model;

import java.util.Scanner;

public class Example4Double 
{
	public static void main(String[] args)
	{
		double d=786545.445d;
		System.out.println(d);
		System.out.println("=======================================");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Double Value");
		 double d1=sc.nextDouble();
		 System.out.println("Your value Is "+d1);
		 sc.close();
	}

}
