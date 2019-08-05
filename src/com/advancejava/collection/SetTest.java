package com.advancejava.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {
	
	/*HasSet :
		1.Duplicate not allowed
	    2.Insertion order not preserved
	    */
	public static void setDemo() {
		HashSet h=new HashSet();
		h.add("B");
		h.add(1);
		h.add(null);
		System.out.println(h.add("jaydeep"));
		System.out.println(h.add("jaydeep"));
		System.out.println(h);
	}
	/*Linked HasSet :
	 * 1.Duplicate not allowed
	 * 2.insertion order preserved
	 * Note :[ In general we can use Linked HasSet to develop cache based application
	 *  where duplication are not allowed and insertion order preserved ]
	 * */
	public static void linkedHashSetDemo() {
		LinkedHashSet lh=new LinkedHashSet();
		lh.add("B");
		lh.add(1);
		lh.add(null);
		System.out.println(lh.add("jaydeep"));
		System.out.println(lh.add("jaydeep"));
		System.out.println(lh);
	}
	/*Shorted Set :It is the child interface of Set(I)
	 * Need : [If we want to represented a group of individual Objects according to some 
	 * shorting order without duplicate then we should go for shorted set.]
	 * 
	 * */
	/*Tree Set.
	 * 1.Duplicate not allowed
	 * 2.Insertion not preserved
	 * Heterogeneous object not allowed
	 * */
	public static void treesetTest() {
		TreeSet t=new TreeSet();
		System.out.println(t.add("jaydeep"));
		System.out.println(t.add("anuj"));
		t.add("anuj");
		//t.add(12);//String cannot be cast to java.lang.Intege
		System.out.println(t);
		/*TreeSet ts=new TreeSet();
		ts.add(new StringBuffer("A"));
		ts.add(new StringBuffer("Z"));
		ts.add(new StringBuffer("L"));
		ts.add(new StringBuffer("B"));
		Note : Object should be homogeneous
		*/
		
	}
	public static void main(String arg[]) {
		//setDemo();
		//linkedHashSetDemo();
		// treesetTest();
	}

}
