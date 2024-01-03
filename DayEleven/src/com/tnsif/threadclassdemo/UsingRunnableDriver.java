//driver class
package com.tnsif.threadclassdemo;

public class UsingRunnableDriver {

	public static void main(String[] args) {
		//UsingRunnable us=new UsingRunnable(5,1,"Hello");
		
		//way 2
		Runnable runnable=new Runnable(){ //anonymous class
			public void run()
			{
				System.out.println("Using runnable interface");
				System.out.println("Hello");
			}
		
		};
		Thread thread=new Thread(runnable);
		thread.start();
		
		//lambda expression
		runnable=()->{System.out.println("Using lambda expression");};
		new Thread(runnable).start();

		
		System.out.println("___________________________");
		
		//new way
		runnable=()->
		{
			for (int i=1;i<=100;i++)
				
			{
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
				System.out.println("Thread is interrupted");
				}
				System.out.println(i*2);
			}
		};
		new Thread(runnable).start();
	}
	

	

}
