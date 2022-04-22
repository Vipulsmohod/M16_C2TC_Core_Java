package com.cg.array;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Element");
		int a=sc.nextInt();
		int arr[]=new int [a];
		
		for(int x=0;x<arr.length;x++)
		{
		arr[x]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]);
			sc.close();
			
		}
		

	}

}
