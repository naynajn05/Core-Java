package com.tnsif.methodoverloadingdemo;

public class Point {
	
	private float x;
	private float y;
	
	public Point(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point(float x) {
		
		this.x = x;
		this.y=x;
	}

	public Point() {
		this.x =5.0f;
		this.y=7.0f;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	

}
