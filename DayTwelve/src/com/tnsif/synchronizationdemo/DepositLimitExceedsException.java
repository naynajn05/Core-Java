package com.tnsif.synchronizationdemo;

public class DepositLimitExceedsException extends Exception {
	DepositLimitExceedsException()
	{
		System.out.println("Deposit limit is exceeded");
	}
	DepositLimitExceedsException(String msg)
	{
		super(msg);
	}

}
