package com.tnsif.methodoverloadingdemo;

public class OverloadDemo {

	public static void main(String[] args) {
		System.out.println(MethodOverloading.addition(34, 78));
		System.out.println(MethodOverloading.addition(12.5f, 67));
		System.out.println(MethodOverloading.addition("Hello ","All"));
		
		Point p1=new Point();
		Point p2=new Point(2.0f);
		Point p3=new Point(1.9f,8.0f);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		
		
		
	}

}
