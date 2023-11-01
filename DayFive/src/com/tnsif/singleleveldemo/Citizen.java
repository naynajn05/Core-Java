//to demonstrate single level inheritance
package com.tnsif.singleleveldemo;

public class Citizen {

	// data members
	private String name;
	private String gender;
	private String aadharNo;
	private long phNo;

	public Citizen() {
		System.out.println("Default constructor for citizen");
	}

	// para. Constructor
	public Citizen(String name, String gender, String aadharNo, long phNo) {
		this.name = name;
		this.gender = gender;
		this.aadharNo = aadharNo;
		this.phNo = phNo;
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", gender=" + gender + ", aadharNo=" + aadharNo + ", phNo=" + phNo + "]";
	}

}
