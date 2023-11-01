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
		String name;
		int id;
		float phone;

		System.out.println("Enter name");
	    name=sc.next();  //name
	    System.out.println("Enter id");
	    id=sc.nextInt(); //id
	    System.out.println("Enter Phone no");
	    phone=sc.nextFloat(); //phone
	    
	    Customer cust3=new Customer(name,id,phone);
	    System.out.println(cust3);
	   
	    Customer cust4=new Customer();
	    cust4.setCustomerName(name);
	    cust4.setCustomerId(id);
	    cust4.setCustomerPhone(phone);
	    System.out.println(cust4);
	    
	    
		
	}

}
