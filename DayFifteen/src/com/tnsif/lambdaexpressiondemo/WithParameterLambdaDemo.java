package com.tnsif.lambdaexpressiondemo;

public class WithParameterLambdaDemo {

	public static void main(String[] args) {
		Message m = (name) -> {
			System.out.println("Welcome " + name);
		};

		m.greet("Gauri");
		
		//IsOdd interface
		IsOdd odd=(a)->a%2 !=0 ? true:false;
		
		System.out.println(odd.checkOdd(12));
		System.out.println(odd.checkOdd(13));
		
		//Cube
		
		Cube c=(a)-> a*a*a;
		
		System.out.println(c.calcCube(2));
	}
	
	

}