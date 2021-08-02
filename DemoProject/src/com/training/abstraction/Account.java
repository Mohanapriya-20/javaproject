package com.training.abstraction;

public abstract class Account {

	double balance;
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	abstract void withdraw(int amount);
	
	abstract void deposit(int amount);
	
	double getBalance()
	{
		return balance;
	}
	
}
