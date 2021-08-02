package com.training.abstraction1;

public  class Branch1 extends ABank{
	final int Bonus=5000;
	@Override
	void carLoan() {
		System.out.println("Car in branch1");
	}

	@Override
	void housingLoan() {
		System.out.println("housing in branch1");
	}
	

	void br1Method(){
		System.out.println("own method in branch1");
	}
	/*
	 * void adminDetails(){ System.out.println("Bank admin details from branch1"); }
	 */

}
