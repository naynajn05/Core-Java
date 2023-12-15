package com.tnsif.abstractclassdemo;

public class Rectangle extends Shape {

	public float width, height;

	public Rectangle() {
		super();
		this.width = 1.0f;
		this.height = 2.0f;
	}

	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	void calArea() {
		area = width * height;

	}

}
