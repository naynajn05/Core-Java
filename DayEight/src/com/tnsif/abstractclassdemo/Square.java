package com.tnsif.abstractclassdemo;

public class Square extends Shape {
	public float side;

	public Square() {
		this.side = 2.0f;
		
	}

	public Square(int side) {
		super();
		this.side = side;
		
	}

	@Override
	void calArea() {
		area = side * side;

	}

}
