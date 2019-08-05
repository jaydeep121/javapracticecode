package com.advancejava.collection;

public class HashTableTest {
	int i;
	HashTableTest(int i){
		this.i=i;
	}
	public int hashCode() {
		return i;
	}
	public String toString() {
		return i+"";
	}
}
