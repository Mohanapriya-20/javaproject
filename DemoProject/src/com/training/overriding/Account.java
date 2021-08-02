package com.training.overriding;

public class Account {

	double balance;
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	void withdraw(int amount)
	{
		System.out.println("Withdrawing Amount: "+amount);
		balance-=amount;
	}
	void deposit(int amount)
	{
		System.out.println("Depositing Amount: "+amount);
		balance+=amount;
	}
	double getBalance()
	{
		return balance;
	}
	
}
