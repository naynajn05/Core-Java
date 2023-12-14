//to demonstrate hier.Inheritance-child 2 class

package com.tnsif.hierachicalinherdemo;

public class Student extends Person {

	// data members
	private String branch;
	private float per;

	// constructor1
	public Student() {
		this.branch = "CSE";
		this.per = 90.6f;

	}

	//constructor 2
	public Student(String branch, float per) {
		super();
		this.branch = branch;
		this.per = per;
	}
	
	
	//constructor 3
	public Student(String name, int age, String bloodGroup,String branch, float per) {
		super(name, age, bloodGroup);
		this.branch = branch;
		this.per = per;
	}


	public String getBranch() {
		return branch;
	}

	


	public void setBranch(String branch) {
		this.branch = branch;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [branch=" + branch + ", per=" + per + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getBloodGroup()=" + getBloodGroup() + "]";
	}

}
