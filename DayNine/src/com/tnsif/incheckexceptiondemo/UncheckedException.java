// To demonstrate uncheck exceptions
package com.tnsif.incheckexceptiondemo;

public class UncheckedException {
	public static void main(String[] args) {
		int x[];
		try {
			x=new int[] {1,2,3,4,5,6};
			System.out.println(x[7]);
		} catch (ArrayIndexOutOfBoundsException ar) {
			System.err.println("Specified Index is not prsent in the array "+ar.getMessage());
		}
		
	}
	
	
	

}
