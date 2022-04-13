package com.cg.scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please Enter  Input ");
		String str=bf.readLine();
		System.out.println(str);
		

	}

}