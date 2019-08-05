package com.seleniumGo.warmup;

public class B extends A {
	public  B() {
		super();
	}
	public B(int i) {
		super(i);
	}
	public B(int i,int j) {
		super(i,j);
	}
	public static void main(String arg[]) {
		B obj=new B();
		B ob=new B(10);
		B o=new B(10, 20);
		
	}
	

}
