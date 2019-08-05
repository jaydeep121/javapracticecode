package com.javaGo.demo;

public class Chromedriver implements Webdriver{

	@Override
	public void get() {
		System.out.println("hello chrome get");
	}
	@Override
	public void findBy() {
	System.out.println("hello chrome findBy");
		
	}
	@Override
	public void sendkeys() {
		System.out.println("hello chrome sendkeys");
	}
}
