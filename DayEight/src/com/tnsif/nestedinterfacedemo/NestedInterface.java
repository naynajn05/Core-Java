package com.tnsif.nestedinterfacedemo;

public class NestedInterface implements MyInterface.InnerInterface{

	@Override
	public void disp() {
		System.out.println("Inside display method");
		
	}

	

}
