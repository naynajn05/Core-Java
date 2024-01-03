//to demonstrate Account class
package com.tnsif.synchronizationdemo;

public class Account implements Bank {
	
	private int accNo;
	private String name;
	private double balance;
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
	@Override
	public  synchronized void deposit(int amt) throws DepositLimitExceedsException {
		if(amt>25000)
		{
			throw new DepositLimitExceedsException("Deposit limit is exceeded");
		}
		else {
		balance=balance+amt;
		System.out.println(amt+" is deposited");
		}
		
	}
	@Override
	public  synchronized void withdraw(int amt) throws InsufficientBalanceException {
		if(balance-amt<=MINBAL)
		{
			throw new InsufficientBalanceException();
		}
		else
		{
			balance=balance-amt;
			System.out.println(amt+" is withdrawn");
		}
		

	}
	
	

}
