package com.tnsif.exceptionsdemo;

import java.io.IOException;

public class CheckedExceptiondemo {

	public static void main(String[] args) throws IOException {
		String str=CheckeExceptionsDriver.acceptText();
		System.out.println("Your String is "+str);

	}

}
