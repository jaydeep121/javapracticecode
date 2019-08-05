package com.innovaccer.assignment.sample;

public class ExecutionFlow {
	
	
	// Here Creating the Ananymous Block
	{
		System.out.println("Instance Block");//2,4
	}
	
	 // Now Creating the Static Block in Class
	 
	static {
		System.out.println("Static Block");//1
	}
	 // Here Creating the Constructor of Class
	 
	ExecutionFlow() {
		System.out.println("Constructor block");//3,5
	}
	public static void main(String arg[]) {
		ExecutionFlow obj=new ExecutionFlow();
		System.out.println("****************");

		ExecutionFlow ob=new ExecutionFlow();
	}
	

}
