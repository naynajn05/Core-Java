//Program to demonstrate method overriding - Runtime Polymorphism
package com.tnsif.overridingdemo;

//subclass
public class HDFC extends RBI {
	@Override
	public float getRateOfInterest() {
		return 6;
	}

}