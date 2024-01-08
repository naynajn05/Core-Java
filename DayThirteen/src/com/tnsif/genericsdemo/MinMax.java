//to demonstrate generic interface
package com.tnsif.genericsdemo;

//generic interface
public interface MinMax<T extends Comparable<T>> {
	
	T min();
	
	T max();
	

}
