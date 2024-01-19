package com.tnsif.lambdademo;

public class WithoutLambdaDemo {

	public static void main(String[] args) {
		// without lambda
		Statement s = new Statement()
		// anonymous class
		{
			public String show() {
				return "Hello all";
			}
		};
		System.out.println(s.show());
	}

}
