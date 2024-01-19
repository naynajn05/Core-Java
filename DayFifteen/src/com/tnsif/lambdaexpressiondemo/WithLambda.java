//to demonstrate implementation of Lambda Exp
package com.tnsif.lambdaexpressiondemo;

public class WithLambda {

	public static void main(String[] args) {
		IStatement s=()->{return "Hello Students";};
		System.out.println(s.show());
	}

}
