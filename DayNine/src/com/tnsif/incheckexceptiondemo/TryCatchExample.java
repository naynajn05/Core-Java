//to demonstrate try catch
package com.tnsif.incheckexceptiondemo;

public class TryCatchExample {

	static void performDivision(int x, int y) {
		int z;
		try {
			System.out.println("Inside the Try block");
			z = x / y;
			System.out.println("Result of division is " + z);
		} catch (ArithmeticException ae) {
			System.out.println("Inside the catch block");
			System.err.println("Error occured due to division by zero " + ae.getMessage());
		}finally
				{
			System.out.println("Inside the finally block");
		}
		System.out.println("Statement after finally block");
	}

}
