//Program to demonstrate creating dynamic test cases
package com.tnsif.junittestdemo;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;



public class TestClassThree {
	// static test case
	@Test
	public void testMethod() {
		Assertions.assertTrue(ArithmeticOperations.isPositive(3));
	}

	// creating single dynamic test case
	@TestFactory
	public DynamicTest generateTestCase() {
		return DynamicTest.dynamicTest("TestCaseOne", () -> Assertions.assertTrue(ArithmeticOperations.IsPositive(3)));
	}

	// creating multiple dynamic test cases
	@TestFactory
	public ArrayList<DynamicTest> generateTestCases() {
		ArrayList<DynamicTest> list = new ArrayList<DynamicTest>();
		list.add(DynamicTest.dynamicTest("TestOne",
				() -> Assertions.assertTrue(ArithmeticOperations.checkPalindrome(1221))));
		list.add(DynamicTest.dynamicTest("TestTwo",
				() -> Assertions.assertEquals(9, ArithmeticOperations.getSquare(3))));
		return list;
	}

	@TestFactory
	public List<DynamicTest> generatDynamicTestCases() {

		return Arrays.asList(DynamicTest.dynamicTest("FirstDynamicTest", () -> Assertions.assertTrue(0 > 2)),
				DynamicTest.dynamicTest("MaximumOfArrayDynamicTest",
						() -> Assertions.assertEquals(200,
								ArithmeticOperations.findMaximum(new int[] { 12, 200, 30 }))),
				DynamicTest.dynamicTest("PalindromeDynamicTest",
						() -> Assertions.assertEquals(true, ArithmeticOperations.checkPalindrome(134))),
				DynamicTest.dynamicTest("DynamicTestThrowsException", () -> new ArithmeticException()),
				DynamicTest.dynamicTest("TestForFail", ()->fail("It is suppose to fail")));
	}

}
