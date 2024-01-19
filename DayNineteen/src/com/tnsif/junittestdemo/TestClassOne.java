//Program to demonstrate test case life cycle 
package com.tnsif.junittestdemo;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

//@TestInstance(Lifecycle.PER_METHOD) //default
@TestInstance(Lifecycle.PER_CLASS)
public class TestClassOne {
	@BeforeAll
	//public static void testBeforeAll() // - need to be static when test instance is LifeCycle.PER_METHOD
	public void testBeforeAll()
	{
		System.out.println("----Before all test methods----");
	}
	
	@AfterAll
	public static void testAfterAll()
	{
		System.out.println("----After all test methods----");
	}
	
	@Test
	public void testMethodOne()
	{
		System.out.println("Test Method 1");
		System.out.println(this);
	}
	
	@Test
	public void testMethodTwo()
	{
		System.out.println("Test Method 2");
		System.out.println(this);
	}
	
	@BeforeEach
	public void testBeforeEachTestMethod()
	{
		System.out.println("***Before Each Test Method***");
	}
	@AfterEach
	public void testAfterEachTestMethod()
	{
		System.out.println("***After Each Test Method***");
	}
}
