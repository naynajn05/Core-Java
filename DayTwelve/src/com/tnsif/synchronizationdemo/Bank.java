//to demonstrate bank interface
package com.tnsif.synchronizationdemo;

public interface Bank {
	int MINBAL=5000; //field are static and final
	static final int DAILY_LIMIT=25000;
	public abstract void deposit(int amt)throws DepositLimitExceedsException ;
	void withdraw(int amt)throws InsufficientBalanceException; //methods are public and abstract
	

}
