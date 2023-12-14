package com.tnsif.association.hasademo;

//contained class
public class Address {
	
	private int flatNo;
	private String street;
	private String city;
	private int pincode;
	public Address(int flatNo, String street, String city, int pincode) {
		super();
		this.flatNo = flatNo;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [flatNo=" + flatNo + ", street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	

}
