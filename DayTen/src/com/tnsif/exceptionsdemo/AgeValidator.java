//to demonstrate user defined exception
package com.tnsif.exceptionsdemo;

public class AgeValidator {
	
	static void validateAge(int age) throws InvalidAgeException
	{
		if (age<18)
		{
			throw new InvalidAgeException("Invalid age..You are not eligible for voting.");
			
		}
	}
}


