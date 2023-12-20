package com.tnsif.exceptionsdemo;


public class Student {
	
	private String name;
	private int rollNo;
	private float per;
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
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	
	void show()
	{
		try
		{
			PercentageValidator.isValidPercentage(per);
			System.out.println("Student details are as follows ");
			System.out.println("Name "+name+" "+"Roll no "+rollNo+" "+"Percentage "+per);
		}
		catch(ArithmeticException a)
		{
			System.out.println("Invalid Percentage");
		}
	}
	

}
