//to demonstrate checked exception
package com.tnsif.exceptionsdemo;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CheckeExceptionsDriver {
	
	static String acceptText() throws IOException 
	{
		try {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the the String: ");
		String str=br.readLine();
		return str;
		}
		finally
		{
			System.out.println("in finally block");
		}
	}

}
