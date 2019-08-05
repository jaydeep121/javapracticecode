package com.javaGo.demo;

public class Hello {
	public static int charCount(String val) {
		int count=0;
		for(int i=0;i<val.length();i++) {
			if(val.charAt(i)=='a') {
				count++;
			}
		}
		return count;
		
	}
	public static void stm() {
		String s="123abh 12a";
		String b=s.replaceAll("[^0-9]", "");
		System.out.println(b);
	}
	public static int nearesr10(int a,int b) {
		int x=Math.abs(a-10);
		int y=Math.abs(b-10);
		if(x==y) {
			return 0;
		}
		else if(x>y) {
			return y;
		}
		return x;
	}
	public static void main(String arh[]) {
		System.out.println(nearesr10(5,9));
		try {
			System.out.println("tty");
		}
		catch(Exception e) {
			e.getMessage();
		}
		
	}
}
