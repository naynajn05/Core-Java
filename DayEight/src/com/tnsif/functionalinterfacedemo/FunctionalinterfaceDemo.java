package com.tnsif.functionalinterfacedemo;

public class FunctionalinterfaceDemo {

	public static void main(String[] args) {
		/*//traditional way
		GreetClass obj=new GreetClass();
		obj.greetings();*/
		
		//Lambda Expression
		Greet g1=()-> 	System.out.println("Hello all");
		
		g1.greetings();	
}
	
}
