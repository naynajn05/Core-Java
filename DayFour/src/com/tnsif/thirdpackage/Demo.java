//to demonstrate singleton class
package com.tnsif.thirdpackage;

public class Demo {

	public static void main(String[] args) {
		// MyClass obj=new MyClass();

		MyClass m = MyClass.getObject();
		m.setId(10);
		System.out.println(m);

		MyClass m1 = MyClass.getObject();
		m1.setId(11);
		System.out.println(m1);
		System.out.println(m);

	}

}
