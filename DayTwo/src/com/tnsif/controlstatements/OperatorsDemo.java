//Program to demonstrate  different operators(ternary,arithmetic,pre/post incrementation/decrementation) in java
package com.tnsif.controlstatements;

public class OperatorsDemo {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		int x = 11;
		System.out.println("a and b value before the operations: " + a + " " + b);

		++a; // Pre Increment //11
		int c = ++a + b + a--; // 12+20+12 //a=11
		System.out.println("c value after the operations: " + c); // 44

		int d = c++ + a + b--; // 44+11+20 //b=19 //c=45
		System.out.println("d value after the operations: " + d);// 75

		System.out.println("a , b,c,d values after the operations: " + a + " " + b + " " + c + " " + d);

		// Ternary operator demonstration

		x = (10 == x) ? 1 : 0;
		System.out.println(x);

	}
}