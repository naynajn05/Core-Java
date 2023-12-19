package com.tnsif.markerinterfacedemo;

public class Driver {

	public static void main(String[] args) {
		Student gauri=new Student(100,"gauri","CSE");
		Teacher t1=new Teacher();
		
		if(t1 instanceof Registrable)
		{
			System.out.println("Student is registered");
		}
		else
		{
			System.out.println("Student is not registered");
		}
		

	}

}
