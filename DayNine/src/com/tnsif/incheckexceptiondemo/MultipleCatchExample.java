//to demonstrate multiple catch example
package com.tnsif.incheckexceptiondemo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchExample {
	public static void divide()
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the two inputs ");
		try {
			a=sc.nextInt();
			b=sc.nextInt();
			
			c=a/b;
			System.out.println("Result of division is "+c);
		}catch (ArithmeticException|ArrayIndexOutOfBoundsException ae) {
			System.out.println("Inside the catch block");
			System.err.println("Error occured due to division by zero " + ae.getMessage());
		}catch (InputMismatchException ie)
		{
			System.err.println("Enter Interger value " + ie.getMessage());
		}
		catch (Exception e)
		{
			System.err.println("Error handled " + e.getMessage());
		}
		finally
		{
			sc.close();
		}
		
	}

}
