package com.seleniumGo.warmup;

public class Functions {
	public void sum() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(" sum of a and b : "+c);
	}
	public void sum(int a) {
		System.out.println(" 1 param");
	}
	public void sum(int a,int b) {
		System.out.println("2 param");
	}
	public void sum(String name) {
		System.out.println(" 1 param different return tpye");
	}
	//no input and no output 
	public void test() {
		int x=10;
		int y=2;
		int z=x+y;
		System.out.println("test o/p : "+z);
	}
	//no input 	but some output
	public int div() {
		int p=10;
		int q=2;
		int r=p/q;
		return r;
	}
	//some input some output
	public int multiply(int m,int n) {
		int l=m*n;
		return l;
	}
	public static void main(String arg[]) {
		Functions f=new Functions();
		int div=f.div();
		System.out.println(div);
		int mul=f.multiply(10,10);
		System.out.println(mul);
	}
}
