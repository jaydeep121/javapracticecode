package com.seleniumGo.oppsConcept;

public class CarTest {

	public static void main(String[] args) {
		BMW b=new BMW();
		b.start();
		System.out.println("******");
		Car c=new BMW();
		c.start();
		c.reFule();
		System.out.println("****");
		Car cb=new Car();
		cb.start();
	}
}
