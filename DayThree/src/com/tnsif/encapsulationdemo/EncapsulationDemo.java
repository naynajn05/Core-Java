package com.tnsif.encapsulationdemo;

public class EncapsulationDemo {

	public static void main(String[] args) {
		OopsDemo oop=new OopsDemo();
		oop.setSerialNo(10);
		oop.setName("Object1");
		oop.setAge(18);
		
		System.out.println(oop);
		
		OopsDemo oop1=new OopsDemo();
		oop1.setSerialNo(11);
		oop1.setName("Object2");
		oop1.setAge(19);
		
		System.out.println(oop1);


		/*
		 * System.out.println(oop.getSerialNo()); System.out.println(oop.getName());
		 * System.out.println(oop.getAge());
		 */
	}

}
