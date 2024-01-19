//Program to define parameterized test cases 
package com.tnsif.junittestdemo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;



public class TestClassTwo {
	
	@RepeatedTest(3) //parameter must be >0
	public void testPositive()
	{
		assertTrue(ArithmeticOperations.IsPositive(5));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {2, 0, -5,6})
	public void testPositives(int no)
	{
		assertTrue(ArithmeticOperations.IsPositive(no));
	}
	
	@ParameterizedTest
	@CsvSource({"123, False","121,True"})
	public void testPalindrome(int no, boolean expected)
	{
		//assertTrue(ArithmeticOperations.checkPalindrome(no));
		boolean actual=ArithmeticOperations.checkPalindrome(no);
		assertEquals(expected, actual);
	}
	
	@ParameterizedTest
	@EnumSource(TimeUnit.class)
	public void testForEnums(TimeUnit t)
	{
		System.out.println(t);
	}
	
	
	@ParameterizedTest
	@MethodSource("getWords")
	void withMethodSource(String word) {
		System.out.println(word);
	}

	private static String[] getWords() {
		String s = "Hello! How are you?";
		return s.split(" ");
	}

}
