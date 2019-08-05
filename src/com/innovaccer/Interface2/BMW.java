package com.innovaccer.Interface2;

public class BMW implements Car{

	@Override
	public void accelarate() {
		System.out.println("BMW : accelarate");
		
	}
	@Override
	public void model() {
		System.out.println("BMW : accelarate");
	}
	public static void main(String arg[]) {
		/*BMW b=new BMW();
		b.start();*/
		Vehichal v=new BMW();
		v.start();
	}
}
