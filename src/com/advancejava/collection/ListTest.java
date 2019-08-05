package com.advancejava.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListTest {
	
	/*When to user ArrayList and when to user LinkedList:
	 * Use ArrayList, When we have broader need of accessing the element rather than insertion and deletion.
	 * We must go with LinkedList when we have broader requirement of insertion and deletion because these insertion and deletion operation
	 * is faster in LinkedList as compared to ArrayList.
	 * ArrayList is non-synchronized that means more than one thread can execute concurrently 
	 */
	public static void arrayListTest() {
		ArrayList arr=new ArrayList<>();
		arr.add("java");
		arr.add("java");
		arr.add(1);
		arr.add(1, "1st index element");
			System.out.println(arr);
	}
	public static LinkedList<Object> getEMPI() {
		LinkedList<Object> ll=new LinkedList<Object>();
		ll.add("anuj");
		ll.add(1012);
		ll.add(null);
		ll.add("anuj");
		ll.set(0, "QA");
		ll.add(0, "jaydeep");
		ll.removeLast();
		ll.addFirst("selenium");
		
		return ll;
	}
	//Vector is Synchronized that means more than one thread can not execute to method at same time
	public static Vector<String> vectorTest() {
		Vector<String> v=new Vector<String>();
		v.add("selenium");
		v.add("java");
		v.add("java");
		return v;
	}
	/*stack is subclass of vector
	*When we have requirement of fetching element in reverse order then we should go with stack
	*
	*/
	public static Stack<String> stactTest() {
		Stack<String> st=new Stack<String>();
		st.push("java");
		st.push("java");
		st.push("selenium");
		st.push("cucumber");
		return st;
	}	
	public static void main(String arh[]) {
		//arrayListTest();
		LinkedList<Object> obj=new LinkedList<Object>();
		obj=getEMPI();
		System.out.println(obj);
		/*Vector<String> vv=new Vector<String>();
		vv=vectorTest();
		System.out.println(vv);
		Iterator<String> it=vv.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Stack<String> s=new Stack<String>();
		s=stactTest();
		System.out.println(s);
		Iterator<String> itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for(String data:s) {
			if(!data.isEmpty()) {
				System.out.println(data);
			}
			
		}*/
	}
}
