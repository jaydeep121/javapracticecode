package com.javaGo.demo;

public  class Parrent {
	public Parrent() {
		System.out.println("constructor block");
	}
	
	static {
		System.out.println("static block");
	}
	public void get() {
		System.out.println("get parrent");
	}
	 public static void main(String arg[]) {
		 Parrent p=new Child();
		 p.get();
		
	 }
	 {
		System.out.println("instance block");
		}
}
 class Child extends Parrent{
	 public void get() {
		 System.out.println("child get");
	 }
	 
}