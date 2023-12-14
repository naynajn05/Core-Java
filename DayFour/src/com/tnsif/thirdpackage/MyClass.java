//to demonstrate private constructor and singleton class
package com.tnsif.thirdpackage;

public class MyClass {
	//data member
	private int id;
	
	private static MyClass obj=new MyClass();

	//getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//private Constructor
	private MyClass() {
		System.out.println("Private constructor is created");
	}
	//Factory method
	public static MyClass getObject()
	{
	return obj;
	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}
	
	

}
