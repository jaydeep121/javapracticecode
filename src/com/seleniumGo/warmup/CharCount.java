package com.seleniumGo.warmup;

import java.util.HashMap;

public class CharCount {
	public static void main(String arh[]) {
		String str = "Programming";
		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : str.toCharArray()) {
			if (map.containsKey(ch)) {
				int val = map.get(ch);
				map.put(ch, val + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}

}
