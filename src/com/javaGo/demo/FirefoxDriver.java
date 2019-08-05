package com.javaGo.demo;

public class FirefoxDriver implements Webdriver {

	@Override
	public void get() {
		System.out.println("hi  firefox get ");
	}
	@Override
	public void findBy() {
		System.out.println("hi  firefox findBy ");	
	}
	@Override
	public void sendkeys() {
		System.out.println("hi  firefox sendkeys ");
	}
	public static void main(String arg[]) {
		Webdriver obj=new FirefoxDriver();
		obj.get();
	}
}
