package com.tnsif.abstractclassdemo;

public class AbstarctDemo {

	public static void main(String[] args) {
		Square s=new Square(); //static binding //tightly coupled
		s.calArea();
		s.show();
		
		Rectangle r=new Rectangle();
		r.calArea();
		r.show();
		
		//Dynamic Binding //Runtime Polymorphism //Late Binding //loose coupling
		Shape s1; //Object reference
		
		s1=new Square();
		s1.calArea();
		s1.show();
		
		s1=new Rectangle();
		s1.calArea();
		s1.show();

	}

}
