package com.tnsif.junittestdemo;

public class ArithmeticOperations {

	public static boolean isPositive(int no) {
		return (no > 0);
	}

	public static int getSquare(int no) {
		return no * no;
	}

	public static int findMaximum(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		return max;
	}

	public static boolean checkPalindrome(int no)
	{
		int rev=0, dno=no;
		while(no!=0)
		{
			rev=rev*10+no%10;
			no=no/10;
		}
		if (dno==rev)
			return true;
		else
			return false;
	}
	
	public static int getFactorial(int no)
	{
		int f=1;
		for(int i=1;i<=no;i++)
		{
			f=f*i;
		}
		return f;
	}

}
