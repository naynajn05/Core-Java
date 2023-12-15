package com.tnsif.cloneableddeemo;

public class Student implements Cloneable{
	
	private String name;
	private int id;
	private String branch;
	
	
	//constructor
	public Student() {
		super();
	}
	public Student(String name, int id, String branch) {
		super();
		this.name = name;
		this.id = id;
		this.branch = branch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", branch=" + branch + "]";
	}
	
	
	/*
	 * //object class public Object clone() throws CloneNotSupportedException {
	 * return super.clone();
	 * 
	 * }
	 */
	//Covariant return type 
	public Student clone() throws CloneNotSupportedException
	{
		return (Student)super.clone();
		
	}
}
