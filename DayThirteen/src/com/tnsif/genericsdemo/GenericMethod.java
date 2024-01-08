//to demonstrate generic method
package com.tnsif.genericsdemo;

public class GenericMethod {
	
	//generic method
public <E> void display(E[] elements)
{
	for( E data:elements)
	{
		System.out.println("Element is "+data);
	}
	
}

/*
 * //non generic method public void print(String name) {
 * System.out.println("Hello "+name); }
 */
	

}
