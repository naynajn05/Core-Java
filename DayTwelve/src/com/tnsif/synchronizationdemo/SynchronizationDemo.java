//driver class
package com.tnsif.synchronizationdemo;

public class SynchronizationDemo {

	public static void main(String[] args) {
		Account acc=new Account(100,"Riddhesh",50000);
		
		System.out.println(acc);
		
		
		//Five account threads are running parallel and sharing same resource
		AccountThread thread[]=new AccountThread[5];
		for(int i=1;i<5;i++)
		{
			thread[i]=new AccountThread(acc,(10000*(i+1)));
			
			try {
				thread[i].join();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println(acc);
	}
	

}
