package com.cg.looping;

import java.util.Scanner;

public class Example1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
			sc.close();
		}
		
	}

}
