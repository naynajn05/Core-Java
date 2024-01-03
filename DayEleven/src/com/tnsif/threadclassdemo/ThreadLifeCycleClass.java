//to demonstrate Thread life cycle
package com.tnsif.threadclassdemo;

public class ThreadLifeCycleClass {

	public static void main(String[] args) {
	
		ChildThread myThread = new ChildThread(5, "Happy"); // new stage

		System.out.println("Before runnable stage,Is Thread alive? " + myThread.isAlive());
		myThread.start(); // Runnable stage
		System.out.println("In runnable stage,Is Thread alive? " + myThread.isAlive());

		try {
			myThread.sleep(3000);
		} catch (InterruptedException e) {
			System.err.println("Thread is interrupted");
		}

		System.out.println("In running stage,Is Thread alive? " + myThread.isAlive());

		System.out.println("After complete execution of Thread,Is Thread alive? " + myThread.isAlive());

	}

}
