package com.cg.junit;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class Assumption6 
{
	@Test
	void m1() 
	{
		System.setProperty("1", "Vipul");
		Assumptions.assumeTrue("Vipul".equals(System.getProperty("2")));
		
	}

}
