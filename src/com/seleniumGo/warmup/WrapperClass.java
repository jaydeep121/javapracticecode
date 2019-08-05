package com.seleniumGo.warmup;

public class WrapperClass {
	public static void main(String arg[]) {
		String x="100";
		System.out.println(x+20);
		int i=Integer.parseInt(x);
		System.out.println(i+1);
		
		/*String y="100A";
		int j=Integer.parseInt(y);
		java.lang.NumberFormatException : for input String ="100A";
		*/
		String d="12.12";
		double d1=Double.parseDouble(d);
		System.out.println(d1+1);
		
		int a=10;
		String s=String.valueOf(a);
		System.out.println(s+1);
		
	}

}
