package com.javaGo.demo;

public class DryRun {
	
	public static String  getOs() {
		String osName=System.getProperty("os.name").toLowerCase();
		return osName;
	}
	public static void main(String arg[]) {
		System.out.println(getOs());
	}
}
