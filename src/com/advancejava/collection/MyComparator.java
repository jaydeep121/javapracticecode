package com.advancejava.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComparator implements Comparator {
	
	/*
	 * 1.Comparator(I) present in  java.ugtil package
	 * 2.Comparator(I) has two method Compare and Equals
	 * 3.Comparator(I) used to achieve customized shorting order
	 * Note : whenever we are implementing comparator(I) only we should provide Implementation 
	 * of Compare Method  and not for Equals Method because  it is already available to our
	 *  class from Object class through inheritance
	 *  
	 */
	//Question : write a program to insert integer objects into reset where the shorting order is descending order 
	public static void comparatorTest() {
		
	}
/*
 * Compare method returns :]
 * "-ve" if obj1 has to come before obj2
 * "+ve" if obj1 has to come after obj2 
 * "0" if obj1 and obj2 are equal 
 *  
	@Override*/
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		if(i1<i2) {
			return -1;
		}
		else if(i1>i2) {
			return +1;
		}
		else {  //i1=i2
		return 0;
		}
	}
	
}
 