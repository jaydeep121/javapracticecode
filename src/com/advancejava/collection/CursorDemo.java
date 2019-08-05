package com.advancejava.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class CursorDemo {
	
	/*The most powerful iterator is list iterator but it's limitation is it is applicable only for list object
	* 
	*Comparison table to three cursor
	*Enumeration :
	*1.Applicable only for legacy classes
	*2.it is legacy 
	*3.single direction (forward direction only)
	*4.only read operation applied
	*5. we can get enumeration using elements() of vector class
	*6.Methods: hasMoreElements(), nextElement()
	*Iterator : 
	*1.Applicable for any collection objects
	*2.it is not legacy 
	*3.single direction (forward direction only)
	*4.read/remove operation applied
	*5.we can get iterator by using iterator() of collection(I)
	*6.Methods :hasNext(),next(),remove()
	*
	*ListIterator :
	*1.Applicable only for list objects
	*2.it is not legacy 
	*3.Bidirectional
	*4.read/remove/replace/add operation allowed
	*5.we will get using listIterator() of List(I)
	*6.9 methods available in ListIterator
	*
	*
	*/
	public static Vector<Integer> vectorTest(){
		Vector<Integer> v=new Vector<Integer>();
		for(int i=0;i<10;i++) {
			v.addElement(i);
		}
		return v;
	}
	public static LinkedList linklistTest() {
		LinkedList ll=new LinkedList<>();
		ll.add("jaydeep");
		ll.add("anuj");
		ll.add("luckey");
		ll.add("sumit");
		ll.add("list");
		
		return ll;
	}
	public static void main(String arr[]) {
		/*
		 * Vector class implementations :
		 * Vector<Integer> vt=vectorTest();
		Enumeration<Integer> enr=vt.elements();
		while(enr.hasMoreElements()) {
			Integer i=(Integer)enr.nextElement();
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println(vt);
		*/
		
		
		Vector<Integer> vv=vectorTest();
		Iterator<Integer> it=vv.iterator();
		while(it.hasNext()) {
			Integer i=(Integer)it.next();
			if(!(i%2==0)) {
				System.out.println(i);
			}
		}
		System.out.println(vv);
		
		
		/*
		 * ListIterator Implementation :
		 * LinkedList l=linklistTest();
		ListIterator litr=l.listIterator();
		System.out.println(l);
		while(litr.hasNext()) {
			String s=(String) litr.next();
			if(s.equals("anuj")) {
				litr.remove();
			}
			else if(s.equals("list")) {
				litr.add("nilu");
			}
			else if(s.equals("jaydeep")) {
				litr.set("jay");
			}
		}
		System.out.println(l);
		*/
	}
}
