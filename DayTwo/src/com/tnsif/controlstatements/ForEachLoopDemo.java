//to demonstrate ForEachLoop
package com.tnsif.controlstatements;

public class ForEachLoopDemo {

	public static void main(String[] args) {

		// integer array
		int arr[] = { 10, 20, 30, 40, 50 };

		for (int i : arr) {
			System.out.println(i);
		}

		// char array
		char ch[] = { 'A', 'B', 'C', 'D' };
		for (char i : ch) {
			System.out.println(i);
		}

		// String array
		String str[] = { "Java", "Programming", "Approch" };
		for (String i : str) {
			System.out.println(i);
		}

	}

}
