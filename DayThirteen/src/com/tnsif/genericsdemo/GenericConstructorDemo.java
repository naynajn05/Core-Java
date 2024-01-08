package com.tnsif.genericsdemo;

public class GenericConstructorDemo {

	public static void main(String[] args) {
		GenericConstructor gc=new GenericConstructor(45);
		
		GenericConstructor gc1=new GenericConstructor(45.7f);
		
	//	GenericConstructor gc2=new GenericConstructor("Nayna");


		gc.show();
		gc1.show();
		

	}

}
