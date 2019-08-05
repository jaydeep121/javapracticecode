package com.seleniumGo.warmup;

public class StringManipulation {
	public static void main(String arg[]) {
		String name="The rains have started here selenium";
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		System.out.println(name.indexOf('s'));
		System.out.println(name.indexOf('s', name.indexOf('s')+1));//15 -- 2nd occurrence of s
		System.out.println(name.indexOf('s', name.indexOf('s', name.indexOf('s')+1)+1));//15 -- 3rd occurrence of s
		System.out.println(name.indexOf("rains"));
		System.out.println(name.indexOf("hello")); //-1
		String s1="The rains Have started here";
		System.out.println(name.equals(s1));
		System.out.println(name.equalsIgnoreCase(s1));
		
		System.out.println("********Trim**********");
		String str=" hello jaydeep ";
		System.out.println(str.trim());
		
		System.out.println("**********replace***********");
		String date="01-01-2018"; //01/01/2018
		System.out.println(date.replace("-", "/"));
		String s3="hello jaydeep";
		System.out.println(s3.replace(" ", ""));
		
		System.out.println("***********substring*************");
		String s4="The rains have started here";
		System.out.println(s4.substring(0, 5));
		
		System.out.println("*********split*********");
		String s5="Hello_Selenium_Testing";
		String arr[]=s5.split("_");
		System.out.println(arr[1]);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}		
	}
}