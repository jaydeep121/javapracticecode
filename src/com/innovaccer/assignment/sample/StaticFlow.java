package com.innovaccer.assignment.sample;

public class StaticFlow {
	
	
	/*1. Identification of static member from top to bottom
	 * 2.Execution of static variable assignment and static block from top to bottom
	 * 3.Execution of main method
	 *  */
	static int i=10;
	
	static {
		m1();
		System.out.println("first static block");
	}
	public static void main(String arg[]) {
		m1();
		System.out.println("main method");
	}
	public static void m1() {
		System.out.println(j);
	}
	static {
		System.out.println("second static block");
	}
	static int j=20;
	

}
