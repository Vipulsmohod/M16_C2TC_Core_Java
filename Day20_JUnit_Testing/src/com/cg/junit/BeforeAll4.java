package com.cg.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class BeforeAll4 
{
	@BeforeAll
	@Test
	 static void m1() 
	{
		System.out.println("Vipul");
		
	}

	@Test
	void m2() 
	{
		System.out.println("Mohod");
		
	}

}
