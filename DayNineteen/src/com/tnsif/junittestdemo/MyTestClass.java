//to demostrate the cases for methods
package com.tnsif.junittestdemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//@Disabled
//@Test
public class MyTestClass {
	
		@Disabled
		@Test
		public void squareTest()
		{		
			int sq=ArithmeticOperations.getSquare(-2);
		//	assertEquals(Expected,Actual);
			assertEquals(5, sq);
		}
		
		@Test
		public void MaxArrayTestOne()
		{
			int a[]= {-12,-23,-34,-5,-30};
			int max=ArithmeticOperations.findMaximum(a);
			assertEquals(-5, max);
		}
		
		@Test
		public void MaxArrayTestTwo()
		{
			int a[]= {12,0,23,34,5,-30};
			int max=ArithmeticOperations.findMaximum(a);
			assertEquals(34, max);
		}
		
		@Test
		public void palindromeTestOne()
		{
			assertTrue(ArithmeticOperations.checkPalindrome(121));
		}
		
		@Test
		public void palindromeTestTwo()
		{
			assertTrue(ArithmeticOperations.checkPalindrome(123));		
		}
}

