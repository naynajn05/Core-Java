package com.tnsif.synchronizationdemo;

public class InsufficientBalanceException extends Exception {
	InsufficientBalanceException()
	{
		System.out.println("Insufficient balance...deposit some amount in the account");
	}

	
	InsufficientBalanceException(String msg)
	{
		super(msg);
	}

}
