//driver for generic method
package com.tnsif.genericsdemo;

public class GenericMethodDemo {

	public static void main(String[] args) {
		GenericMethod gm=new GenericMethod();
		
		Integer intArray[]= {10,20,40,60};
		gm.display(intArray);
		
		String intString[]= {"Java","Programming","training"};
		gm.display(intString);
		
		Person p[]=new Person[] {
				new Person("Nayna",22),
				new Person("Neha",56),
				new Person("Gauri",34)
		};
		gm.display(p);
		
		
		
	
		
	}
	}


