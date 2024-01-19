package com.tnsif.lambdademo;

public class LambdaWithParameter {

	public static void main(String[] args) {
		Message m=(name)->{System.out.println("Hello "+name);};
		m.greet("Harsh");
		
		Cube c=(a)->{return (a*a*a);};
		System.out.println("Cube of a 5 is "+c.calculate(5));
		
		Cube c1=(a)->a*a*a;
		System.out.println("Cube of a 2 is "+c.calculate(2));

		
		isOdd odd=(a)->a%2!=0 ? true:false;
		System.out.println(odd.check(23));
		System.out.println(odd.check(12));
	}

}
