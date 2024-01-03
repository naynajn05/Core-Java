package com.tnsif.threadclassdemo;

public class ChildThreadDemo {

	public static void main(String[] args) {
		ChildThread t1=new ChildThread(5,"Hello");
		ChildThread t2=new ChildThread(10,"Hi");
		
		t1.start();
		t2.start();
		
		System.out.println("End of the main method"); //main thread

	}

}
