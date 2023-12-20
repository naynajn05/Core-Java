//to demonstrate throw keyword
package com.tnsif.exceptionsdemo;
import java.util.Scanner;

public class PercentageValidator {

	static float acceptNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the valid percentage");
		float per=sc.nextFloat();
		return per;
		
	}
	static void isValidPercentage(float per) throws ArithmeticException
	{
		if(per>=0 && per<=100)
		{
			System.out.println("Valid Percentage "+per);
		}
		else
		{
			throw new ArithmeticException("Invalid Percentage..Please enter Valid Percentage ");
		}	
	}
}
