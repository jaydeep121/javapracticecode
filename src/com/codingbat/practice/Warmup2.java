package com.codingbat.practice;

public class Warmup2 {
	public static String stringTimes(String str,int n) {
		String result="";
		for(int i=0;i<n;i++) {
			//result=result+str;
			result+=str;
		}
		return result;
	}
	public static String frontTimes(String str,int n) {
		String fontStr=str.substring(0, 3);
		String result="";
		for(int i=0;i<n;i++) {
			result=result+fontStr;
		}

		return result;
	}
	public static int countXX(String str) {
		 int count = 0;
		 for (int i = 0; i < str.length()-1; i++) {
			 if (str.substring(i, i+2).equals("xx")) {
				 count++;
				 }
			 }
		 return count;
	}
	public static boolean doubleX(String str) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i+1)=='x' && (str.charAt(i)=='x')) {
				return true;
			}
		}
		return false;
	}
	public static void main(String arg[]) {
		System.out.println(doubleX("jayax"));
		//System.out.println(countXX("xxxx"));
		//System.out.println(frontTimes("jay",5));
		//System.out.println(stringTimes("Hi",3));
	}

}
