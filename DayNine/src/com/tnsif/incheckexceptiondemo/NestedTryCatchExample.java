package com.tnsif.incheckexceptiondemo;

public class NestedTryCatchExample {
	public static void check()
	{
		//string 1
		String str="TNS";
		int slength=str.length();
		System.out.println(slength);
		
		//string 2
		String anotherString=null;
		try {
		try {
			System.out.println(str.charAt(8));
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println("Character at this index is not present..."+e.getMessage());
		}
		System.out.println(anotherString.length());
		}
		catch(NullPointerException npe)
		{
			System.err.println("String is empty.... "+npe.getMessage());
		}
		
	}

}
