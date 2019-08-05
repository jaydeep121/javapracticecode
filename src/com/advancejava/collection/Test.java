package com.advancejava.collection;

import java.util.Hashtable;

public class Test {
	
	public static void main(String arg[]) {
		Hashtable ht=new Hashtable();
		ht.put(new HashTableTest(5),"A");
		ht.put(new HashTableTest(6),"B");
		ht.put(new HashTableTest(7),"C");
		ht.put(new HashTableTest(8),"D");
		System.out.println(ht);
	}
}

