package com.seleniumGo.oppsConcept;

public class BankTest {
	public static void main(String arg[]) {
		ICICBank ic=new ICICBank();
		//ic.credit();
		System.out.println(ic.educationLoan());
		UKBank uk=new ICICBank();
		uk.educationLoan();
		
	}
}
