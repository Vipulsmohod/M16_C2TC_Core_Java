package com.cg.assignment2;

import java.util.Scanner;

public class SumOfDigit {
	
	
	static int findSum(int number)  
	{  
	
	return number == 0 ? 0 : number % 10 +findSum(number/10) ;  
	}  
	
	public static void main(String args[])  
	{  
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	 int a= sc.nextInt();
	  
	System.out.println("The sum of digits: "+findSum(a));  
	}  
	}  

