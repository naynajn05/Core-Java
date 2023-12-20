package com.tnsif.exceptionsdemo;

public class UsingThrowDemo {

	public static void main(String[] args) {
		Student obj=new Student();
		obj.setName("Sakshi");
		obj.setRollNo(12);
		PercentageValidator.acceptNumber();
		obj.show();
		
		

	}

}
