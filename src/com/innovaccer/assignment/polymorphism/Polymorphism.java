package com.innovaccer.assignment.polymorphism;

public class Polymorphism {
	public  int sum() {
		int a=10;
		int b=20;
		int sum=a+b;
		return sum;
	}
	//overloading 
	public  int sum(int a,int b) {
		int sum;
		sum=a+b;
		return sum;
	}
	public static void main(String arg[]) {
		Polymorphism p=new Polymorphism();
		int result=p.sum();
		System.out.println(result);
		int result2=p.sum(2, 3);
		System.out.println(result2);
	}
}
