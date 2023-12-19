//Program to demonstrate Command Line Arguments 
package com.tnsif.wrapperclassdemo;

public class WrapperClassDemoOne {

	public static void main(String args[]) {
		System.out.println("Hello World");

		int a = Integer.parseInt(args[0]);
		System.out.println(a);
		int b = Integer.parseInt(args[1]);
		int c = a + b;
		System.out.println(c);
	}

}
