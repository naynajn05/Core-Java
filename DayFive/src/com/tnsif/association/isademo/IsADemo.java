package com.tnsif.association.isademo;

//driver
public class IsADemo {

	public static void main(String[] args) {
		Manager m=new Manager();
		System.out.println(m);
		
		Manager m1=new Manager("Ajay",13,"Finance",5);
		Employee e=new Employee("Gauri",11,"HR");
		System.out.println(m1);
		System.out.println(e);
	}

}
