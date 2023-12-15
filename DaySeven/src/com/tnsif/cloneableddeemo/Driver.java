package com.tnsif.cloneableddeemo;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1=new Student();
		s1.setName("Riddhesh");
		s1.setId(10);
		s1.setBranch("CSE");
		System.out.println(s1);
		
		Student s2=(Student)s1.clone();
		s2.setName("Gauri");
		s2.setId(11);
		s2.setBranch("IT");
		
		System.out.println(s2);
		
		Student s3=s1.clone();
		s3.setName("Kiran");
		s3.setId(12);
		s3.setBranch("EXTC");
		
		System.out.println(s3);
	}

}
