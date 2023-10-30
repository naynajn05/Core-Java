
//to demonstrate the constructor
package com.tnsif.constructordemo;

public class Customer {
	// data members
	private String customerName;
	private int customerId;
	private float customerPhone;

	// default Constructor
	public Customer() {
		System.out.println("Default constructor");
	}

	//Parameterized Constructor
	public Customer(String customerName, int customerId, float customerPhone) {
		this();  //to call default constructor
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerPhone = customerPhone;
	}

	// getters and setters
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public float getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(float customerPhone) {
		this.customerPhone = customerPhone;
	}

	
	//toString-object class
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerPhone="
				+ customerPhone + "]";
	}
	
	

}
