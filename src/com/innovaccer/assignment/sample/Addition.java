package com.innovaccer.assignment.sample;

import java.util.Scanner;

public class Addition {
	
	public static void main(String args[]) {
		  int a,b,sum;
		  System.out.println("please Enter two number");
	      Scanner in = new Scanner(System.in);
	      a = in.nextInt();
	      b = in.nextInt();
	      sum= a + b;
	      System.out.println("Sum of the integers = " + sum);
	   }
}
