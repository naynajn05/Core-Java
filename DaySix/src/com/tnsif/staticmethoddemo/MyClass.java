//to demonstrate Static method
package com.tnsif.staticmethoddemo;

public class MyClass {
	//instance variable
	private int section;
	//static variable
	private static int srNo;
	
	//static block
	static
	{
	System.out.println("inside a static block");
	srNo=10;
	System.out.println("srNo= "+srNo);
	}
	
	
	public MyClass() {
		srNo++;
		section++;
	}

	public MyClass(int section) {
	System.out.println("Inside a constructor");
		
		this.section = section;
	}

	@Override
	public String toString() {
		return "MyClass [section=" + section + ","+"srNo=" + srNo + "]";
	}

	
	static void display()
	{
		//System.out.println(section);
		System.out.println("SrNo= "+srNo);
	}
	
	
	
	
}
