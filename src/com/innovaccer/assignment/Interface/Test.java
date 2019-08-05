package com.innovaccer.assignment.Interface;

public class Test implements A,B {

	//@Override
	public void m1() {	
		System.out.println("implementation class");
	}
	public static void main(String arg[]) {
		A obj=new Test();
		obj.m1();
		B ob=new Test();
		ob.m1();
	}
}
