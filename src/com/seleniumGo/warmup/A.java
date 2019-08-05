package com.seleniumGo.warmup;

public class A {
	
	public A() {
		System.out.println("parent class const");
	}
	public A(int i) {
		System.out.println("parent class with value of i "+i);
	}
	public A(int i,int j) {
		System.out.println("parent class with value of i and j respectively"+i+" "+j);
	}
}
