//Program to demonstrate Assumptions
package com.tnsif.junittestdemo;

import java.util.function.BooleanSupplier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class TestClassFour {

	@Test
	public void testMethodOne()
	{
		int n=5;
		Assumptions.assumeTrue(n>=0); // if it passes then next code will execute
		//if it fails then next code will be skipped
		System.out.println("Test for Factorial");
		Assertions.assertEquals(120, ArithmeticOperations.getFactorial(n));		
	}
	
	@Test
	public void testMethodTwo()
	{
		int n=10;
		//Assumptions.assumingThat(n>=0, ()->Assertions.assertEquals(1, ArithmeticOperations.getFactorial(n)));
		
		BooleanSupplier supp=()->n>=0;
		Assumptions.assumingThat(supp, ()->System.out.println("Assumption is satisfied"));
	}
}
