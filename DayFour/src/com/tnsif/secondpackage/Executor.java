package com.tnsif.secondpackage;

import com.tnsif.firstpackage.Base;

public class Executor extends Base {

	public static void main(String[] args) {
		Base b = new Base();

		//b.methodDefault();
		//b.methodProtected();
		b.methodPublic();
		b.display();

		// change the values
		//b.varDefault = 50;
		//b.varProtected = 24;
		b.varPublic = 67;

		//b.methodDefault();
		//b.methodProtected();
		b.methodPublic();

		//b.methodPrivate(); //not visible

	}

}
