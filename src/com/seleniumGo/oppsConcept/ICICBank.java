package com.seleniumGo.oppsConcept;

public class ICICBank implements USBank,UKBank {

	@Override
	public int educationLoan() {
		
		return 2000;
	}

	@Override
	public void debit() {
		System.out.println("icic---dedit");
		
	}

	@Override
	public void credit() {
		System.out.println("icic---credit");
		
	}

	@Override
	public void mutualFund() {
		System.out.println("icic---mutualFund");
		
	}

}
