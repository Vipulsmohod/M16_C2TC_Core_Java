package com.cg.scanner;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Integer Value");
		int a=s.nextInt();
		System.out.println("Enter Double Value");
		double b=s.nextDouble();
		String str=s.nextLine();
		System.out.println("Your Integer Value Is "+a);
		System.out.println("Your Double Value Is "+b);
		System.out.println(str);
		s.close();

	}

}