//to demonstrate multithreading using Thread class
package com.tnsif.threadclassdemo;

public class ChildThread extends Thread {
	private int n;
	private String msg;
	
	public ChildThread(int n, String msg) {
		
		this.n = n;
		this.msg = msg;
	}
	
	
	public void run() {
		for (int i=1;i<=n;i++)
		{
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.err.println("Thread is interrupted "+e.getMessage());
			}
		System.out.println("message "+msg+" "+"number "+i+" "+Thread.currentThread().getName());	
		}
		
	}
	

}
