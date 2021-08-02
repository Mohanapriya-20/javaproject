package com.training.abstraction1;

public class Main {

	public static void main(String[] args) {
		ABank ref;
		ref=new Branch1();
		ref.carLoan();
		ref.housingLoan();
		ref.adminDetails();
       System.out.println(ref.Bonus);
		Branch1 br1=(Branch1)ref;
		br1.br1Method();
		
		ref=new Subbranch();
		ref.carLoan();
		ref.housingLoan();
		ref.adminDetails();
		
		Subbranch sb=(Subbranch)ref;
		sb. br2Method();
		sb.subPay();
	}

}
