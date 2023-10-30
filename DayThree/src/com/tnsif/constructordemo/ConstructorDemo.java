package com.tnsif.constructordemo;


import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		Customer cust1=new Customer();
		System.out.println(cust1);
		
		Customer cust2=new Customer("Nayna",23,568638347);
		System.out.println(cust2);
		
		//scanner class to accept user input
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		
	}

}
