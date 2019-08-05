package com.innovaccer.collection.assignment;

import java.util.Stack;

public class StackReverse {
	
	public static void stackElement() {
		String str="ram is drinking water";
		String arr[]=str.split(" ");
		Stack<String> st=new Stack<String>();
		for(String s:arr) {
			st.push(s);
		}
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}
	public static void main(String arg[]) {
		stackElement();
	}
}
