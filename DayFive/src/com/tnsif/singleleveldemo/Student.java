//to demonstrate child class
package com.tnsif.singleleveldemo;

public class Student extends Citizen {
	//data members
	private String collegeName;
	private int rollNo;
	private String courseName;
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Student(String name, String gender, String aadharNo, long phNo,String collegeName, int rollNo, String courseName) {
		super( name,  gender,  aadharNo, phNo);
		this.collegeName = collegeName;
		this.rollNo = rollNo;
		this.courseName = courseName;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [collegeName=" + collegeName + ", rollNo=" + rollNo + ", courseName=" + courseName
				+ ", getName()=" + getName() + ", getGender()=" + getGender() + ", getAadharNo()=" + getAadharNo()
				+ ", getPhNo()=" + getPhNo() + "]";
	}
	
	
	
	

}
