package com.training.overriding;

public class Saving extends Account {

	public Saving(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(int amount) {
		System.out.println("Withdrawing Amount: "+amount);
		balance=balance+amount+100;
	}

	@Override
	void deposit(int amount) {
		System.out.println("Depositing Amount: "+amount);
		balance=(balance-amount)-100;
	}

}
