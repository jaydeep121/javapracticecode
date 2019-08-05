package com.innovaccer.collection.assignment;

import java.util.HashMap;

public class WordOccuranceCount {
	
	public static void charCount() {
		String arr="ram go to home , ram not able to eat but he is eating mango";
		String n[]=arr.split(" ");
		HashMap<String , Integer> map=new HashMap<>();
		for(String a:n) {
			if(map.containsKey(a)) {
				int val=map.get(a);
				map.put(a, val+1);
			}
			else {
				map.put(a, 1);
			}
		}
		System.out.println(map);	
	}
	public static void main(String[] args) {
		charCount();
	}
}
