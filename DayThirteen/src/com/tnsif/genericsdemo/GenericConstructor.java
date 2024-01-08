//To demonstrate Generic constructor
package com.tnsif.genericsdemo;

public class GenericConstructor {
private double v;


//generic constructor
public <T extends Number>GenericConstructor(T t) {
	v= t.doubleValue();
}

public void show()
{
	System.out.println("input is "+v);
}

}
