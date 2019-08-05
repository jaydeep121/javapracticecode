package com.seleniumGo.warmup;

import java.util.ArrayList;

public class DynamicArray {
	public static void main(String arg[]) {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		System.out.println(ar);
		ArrayList<Object> a=new ArrayList<>();
		a.add(1);
		a.add("jaydeep");
		a.add(false);
		System.out.println(a.size()+" : "+a.get(2));
	}
}
