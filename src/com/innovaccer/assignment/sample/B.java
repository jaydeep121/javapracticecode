package com.innovaccer.assignment.sample;

public class B extends A {
	
	void sum() {
		super.sum();
		System.out.println("B");
	}

	public static void main(String arg[]) {
		B ob=new B();
		ob.sum();
	}

}
