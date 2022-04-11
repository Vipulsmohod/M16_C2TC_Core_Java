package com.cg.operator;

import java.util.Scanner;

public class RelationalOperator 
{ public static void main(String[] args) {
	

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first Number");
    int x=sc.nextInt();
    System.out.println("Enter Second Number");
    int y=sc.nextInt();
    Boolean z =x<y;
    System.out.println(z);

}
}