package com.innovaccer.collection.assignment;

import java.util.ArrayList;

public class ArrayClone {
	
	public static void cloneArray() {
		ArrayList<String> originalArray=new ArrayList<>();
		originalArray.add("jaydeep");
		originalArray.add("anuj");
		originalArray.add("sudhir");
		ArrayList<String> cloneArr=(ArrayList<String>)originalArray.clone();
		System.out.println("clone array element : "+cloneArr);
	}
	public static void main(String arg[]) {
		cloneArray();
	}

}
