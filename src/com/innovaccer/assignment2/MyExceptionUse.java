package com.innovaccer.assignment2;

public class MyExceptionUse {
	public static void main(String arg[]) {
		try {
			throw new MyException("Exception occured");
		}
		catch(MyException e) {
			//e.getMessage();
			System.out.println(e.getMessage());
		}
	}

}
