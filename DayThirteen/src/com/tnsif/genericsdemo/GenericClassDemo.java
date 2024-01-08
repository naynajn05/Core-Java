package com.tnsif.genericsdemo;

public class GenericClassDemo {

	public static void main(String[] args) {
		// String Geberic class
		GenericClass<String> str = new GenericClass<String>();
		str.set("Nayna");
		//str.set(34);
		System.out.println(str.get());

		
		
		// Integer Geberic class
		GenericClass<Integer> intData = new GenericClass<Integer>();
		intData.set(19);
		//intData.set("Nayna");
		System.out.println(intData.get());
		
		//Person Class
		GenericClass<Person> personData=new GenericClass<Person>();
		personData.set(new Person("Amit",35));
		System.out.println(personData.get());

	}

}
