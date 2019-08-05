package com.innovaccer.assignment.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SystemInput {
	
	public static String bufferInput() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter buffer input");
		String name=br.readLine();// to read input
		return name;
	}
	public static int scannerInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two scanner input");
		int a=sc.nextInt();// to read input as integer
		int b=sc.nextInt();
		int sum=a+b;
		return sum;
	}
	public static void colsoleInput() {
		//System.out.println("Enter console input");
		String name=System.console().readLine();
		System.out.println(name);
	}
	public static void main(String arg[]) throws IOException {
		//System.out.println(bufferInput());
		//int result=scannerInput();
		//System.out.println(result);
		colsoleInput();
	}

}
