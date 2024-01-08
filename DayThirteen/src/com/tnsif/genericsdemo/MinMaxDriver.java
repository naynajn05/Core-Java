package com.tnsif.genericsdemo;

public class MinMaxDriver {

	public static void main(String[] args) {
		Float arrFloat[] = { 12.5f, 67.9f, 89.77f, 102.6f };

		MINMaxImpl<Float> obj = new MINMaxImpl<>(arrFloat);
		System.out.println(obj.min());

		System.out.println(obj.max());

		Integer arrInt[] = { 12, 67, 89, 102 };

		MINMaxImpl<Integer> obj1 = new MINMaxImpl<>(arrInt);
		System.out.println(obj1.min());

		System.out.println(obj1.max());
		
		String arrString[] = {"Nayna","Sakshi","Sanket","Pratikha","Aditya" };

		MINMaxImpl<String> obj2 = new MINMaxImpl<>(arrString);
		System.out.println(obj2.min());

		System.out.println(obj2.max());

		Person p[]=new Person[] {
				new Person("Nayna",22),
				new Person("Neha",56),
				new Person("Gauri",34),
				new Person("Babita",56),
				new Person("Ziya",23)
		};
		MINMaxImpl<Person> p1=new MINMaxImpl<>(p);
		System.out.println(p1.min());

		System.out.println(p1.max());

		
	}

}
