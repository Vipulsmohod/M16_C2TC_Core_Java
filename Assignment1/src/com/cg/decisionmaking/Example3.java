package com.cg.decisionmaking;

public class Example3 
{
	public static void main(String[] args) 
	{
		int age=15,weight=135;
		if(age>=12)
		{
			if(weight>=40)
			{
				if(weight<=110) 
				{
					System.out.println("Eligible to bunjee jumping");
				}
				else
				{
					System.out.println("Extra ropes will be added");
				}
				
			}
			else
			{
				System.out.println(" you are not Eligible to bunjee jumping");

				
			}
		}
		else {
			System.out.println(" you are not Eligible to bunjee jumping");
		}
		
	}

}
