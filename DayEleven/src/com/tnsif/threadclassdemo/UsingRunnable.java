//to demonstrate multithreading by implementing runnable interface
package com.tnsif.threadclassdemo;

public class UsingRunnable extends Parent  implements Runnable {
	Thread thread;
	int high,low;
	String msg;
	
	//constructor
	public UsingRunnable(int high, int low, String msg) {
		this.high = high;
		this.low = low;
		this.msg = msg;
		thread=new Thread(this,"child thread");
		thread.start();
	}

public void disp()
{
	
}
	@Override
	public void run() {
		for (int i=low;i<=high;i++)
						
		{
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
			System.out.println("Thread is interrupted");
			}
			System.out.println(msg+i);
		}
		
	}
	
	

}
