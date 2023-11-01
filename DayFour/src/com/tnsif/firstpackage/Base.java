//to demonstrate access modifiers and packages

package com.tnsif.firstpackage;

public class Base {

	// declare data members
	private int varPrivate = 10;
	int varDefault = 20;
	protected int varProtected = 30;
	public int varPublic = 40;
	
	//declare methods
	private void methodPrivate()
	{
		System.out.println("Private variable:"+varPrivate);
	}
	 void methodDefault()
	{
		System.out.println("Default variable:"+varDefault);
	}
	
	protected void methodProtected()
	{
		System.out.println("Protected variable:"+varProtected);
	}
	public void methodPublic()
	{
		System.out.println("Protected variable:"+varPublic);
	}
	
	//to access protected outside the package
	public void display()
	{
		varProtected=67;
		methodProtected();
	}

}
