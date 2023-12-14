package com.tnsif.association.hasademo;

//Container class
public class Student {

	private String name;
	private int rollNo;
	//dependency/association
	private Address address;
	
	public Student(String name, int rollNo, Address address) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void dispInfo()
	
	{
		System.out.println("Name :"+name+ ""+"rollNo "+rollNo+""+"Address: "+address.getFlatNo()+address.getStreet()+address.getCity()+address.getPincode());
	}
}
