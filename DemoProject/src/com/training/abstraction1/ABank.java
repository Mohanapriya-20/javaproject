package com.training.abstraction1;

public abstract class ABank {
	final int Bonus=1000;
	abstract void carLoan();
	abstract void housingLoan();
	final void   adminDetails(){
		System.out.println("Bank admin details");
}
}