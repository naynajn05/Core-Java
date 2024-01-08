package com.tnsif.genericsdemo;

public class Person implements Comparable<Person>{
	
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Person o) {
		//return this.name.compareTo(o.name);
		return this.age.compareTo(o.age);
	
	}
	
	
	

}
