package com.tnsif.nestedinterfacedemo;
//outer interface
public interface MyInterface {
	
	void show();
	
	//inner interface
	public interface InnerInterface
	{
		int a=20;
		void disp();
	}

}
