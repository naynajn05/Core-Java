package com.tnsif.association.hasademo;

public class HasADemo {

	public static void main(String[] args) {
		
		
		Address addr=new Address(504,"greencity","Mumbai",421501);
		Student s1=new Student("Sakshi",24,addr);
		s1.dispInfo();
	}

}
