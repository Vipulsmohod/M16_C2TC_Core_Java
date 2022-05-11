package com.cg.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public class Disabled3 
{

	@Test
	void m2()
	{
		int a=1;
		int b=2;
	assertEquals(a, b);
	}


	@Test
	void m3()
	{
		int a=1;
		int b=1;
	assertEquals(a, b);
	}

}
