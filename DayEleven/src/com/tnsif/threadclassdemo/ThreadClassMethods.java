//to demonstrate Thread class methods
package com.tnsif.threadclassdemo;

public class ThreadClassMethods {

	public static void main(String[] args) {
		ChildThread threadOne=new ChildThread(5,"Nashik"); //created thread one
		ChildThread threadTwo=new ChildThread(10,"Mumbai");//created thread two
		
		
		threadOne.start();
		threadTwo.start();
		
		//threadOne.run(); //single thread 
		//threadTwo.run();
		
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Parent Thread");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread());
		//Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread());
		
		try {
			threadOne.join();;  //ask  current thread to wait till threadOne is completed
			threadOne.join(300); //waitl till min 300ms
		} catch (InterruptedException e) {
			System.out.println("thread is interrupted "+e.getMessage());
		}
		System.out.println("End of the main thread");
	}

}
