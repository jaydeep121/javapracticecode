package com.innovaccer.assignment.inheritance;

public class SBIBank extends Bank {


	public void accountOpen() {
		System.out.println("SBI Bank account open process");
	}
	public static void main(String arg[]) {
		SBIBank b=new SBIBank();
		b.accountOpen();
		b.enquiry();
	}
	

}
