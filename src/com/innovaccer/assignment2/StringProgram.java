package com.innovaccer.assignment2;

public class StringProgram {

	public static StringBuilder stringBuilder() {
		String str="hello";
		StringBuilder sb=new StringBuilder(str);
		sb=sb.append(" java String builder");
		return sb;
	}
	public static StringBuffer stringBuffer() {
		String str="hello";
		StringBuffer sb=new StringBuffer(str);
		sb=sb.append(" java String buffer");
		return sb;
	}
	
	public static void main(String arg[]) {
		System.out.println(stringBuilder());
		System.out.println(stringBuffer());
	}

}
