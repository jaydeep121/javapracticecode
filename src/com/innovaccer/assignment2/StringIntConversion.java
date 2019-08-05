package com.innovaccer.assignment2;

public class StringIntConversion {
	public static void main(String arg[]) {
		
		//String to int 
		String s="12";
		int a=Integer.parseInt(s);
		a=a+1;
		System.out.println(a);
		
		//int to string
		String str=Integer.toString(a);
		str=str+"jay";
		System.out.println(str);
		
	}

}
