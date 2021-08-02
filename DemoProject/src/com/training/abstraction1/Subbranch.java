package com.training.abstraction1;

public final class Subbranch extends Branch2 {

	@Override
	void housingLoan() {
		System.out.println("house in subbranch");

	}
	void subPay(){
		System.out.println("own meth of subbranch");
	}
	@Override
	void carLoan() {
		System.out.println("car in subbranch");
	}
	/*
	 * class A extends Subbranch {
	 * 
	 * }
	 */

}
