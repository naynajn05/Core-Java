package com.tnsif.exceptionsdemo;

public class InvalidAgeException extends Exception {
	
	InvalidAgeException()
	{
		super("Invalid Age");
	}

	
	InvalidAgeException(String message)
	{
		super(message);
	}
}
