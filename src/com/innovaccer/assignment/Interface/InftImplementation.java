package com.innovaccer.assignment.Interface;

public class InftImplementation implements InftB,IntfA {
	
	/*@Override
	public void m1() {
		IntfB.super.m1();
		System.out.println("implentation class body");
	}*/
	public static void main(String arg[]) {
		InftImplementation in=new InftImplementation();
		in.m1();
	}
	@Override
	public void m1() {
		System.out.println("implentation class body");
		InftB.super.m1();
	}
}
