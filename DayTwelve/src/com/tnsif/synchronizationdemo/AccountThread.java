package com.tnsif.synchronizationdemo;

public class AccountThread extends Thread{
	private Account acc;
	private int amt;
	
	public AccountThread(Account acc, int amt) {
		super();
		this.acc = acc;
		this.amt = amt;
		start();
	}
	
	public void run()
	{
		try {
			acc.withdraw(amt);
		} catch (InsufficientBalanceException e) {
			System.out.println("Insufficient balance");
			System.err.println(e.getMessage());
		}
	}
	
	
	

}
