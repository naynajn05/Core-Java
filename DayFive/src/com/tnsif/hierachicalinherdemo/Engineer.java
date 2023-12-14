//to demonstrate hier.Inheritance-child1 class

package com.tnsif.hierachicalinherdemo;

public class Engineer extends Person {
	//data member
	private String dept;
	private int salary;
	
	
	
	//constructor1
	public Engineer(String dept, int salary) {
		super();
		this.dept = dept;
		this.salary = salary;
	}
	
	//constructor2
	public Engineer() {
		super();  //calling parent class deafault constructor
	}

	
	//constructor3
	public Engineer(String name, int age, String bloodGroup,String dept, int salary) {
		super(name, age, bloodGroup);
		this.dept=dept;
		this.salary=salary;
	}


	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Engineer [dept=" + dept + ", salary=" + salary + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getBloodGroup()=" + getBloodGroup() + "]";
	}
	
	

}
