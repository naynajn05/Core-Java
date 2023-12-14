package com.tnsif.finaldemo;

public class FinalVariableDemo {
	
	//declare final variable
	//final int a; //final variable can not kept uninitailized
	
	final int x=20;
	
	final static int y;
	
	final static int a;
	
	final static int z=30;
	
	void change()
	{
		x=30; //final vari value can not be changed
		y=34;//final vari value can not be changed
	}
	
	static
	{
		//x=50;
		y=67;
		 a=56;
		// z=56;
	}
	

}
