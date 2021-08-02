package com.training.abstraction;

public class Current extends Account {

	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(int amount) {

		System.out.println("Withdrawing Amount: "+amount);
		balance-=amount;
		//super.withdraw(amount);
	}

	@Override
	void deposit(int amount) {
		System.out.println("Depositing Amount: "+amount);
		balance+=amount;
		//super.deposit(amount);
	}
	void checkInterest()
	{
		System.out.println("Checking Interest");
	}
	

}
