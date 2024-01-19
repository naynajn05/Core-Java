package com.tnsif.lambdademo;

public class WithLambdaExp {

	public static void main(String[] args) {
		Statement s=()-> {return "Hello Students";};
		System.out.println(s.show());
		
		Statement s1=()->{return "Batch B77";};
		System.out.println(s1.show());
	}

}
