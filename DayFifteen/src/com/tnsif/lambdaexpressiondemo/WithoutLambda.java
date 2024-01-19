package com.tnsif.lambdaexpressiondemo;

public class WithoutLambda {

	public static void main(String[] args) {
		//without lamabda
		
		IStatement s=new IStatement() {//anonymous class
  public String show()
  {
	  
	return "Without lambda";
  }
	};
	System.out.println(s.show());

	}
}
