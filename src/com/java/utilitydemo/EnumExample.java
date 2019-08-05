package com.java.utilitydemo;


enum Level {
	Low,Medium,High		
}
public class EnumExample {
	
	public static void main(String arg[]) {
		Level l=Level.Medium;
		switch(l) {
		case Low:System.out.println("Low level");
		break;
		case Medium:System.out.println("Medium level");
		break;
		case High: System.out.println("Hign level");
		break;
		default :System.out.println("default level");	
		}
	}
}
