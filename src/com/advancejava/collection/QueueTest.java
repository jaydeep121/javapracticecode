package com.advancejava.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueTest {
	
	public static PriorityQueue<String> priorityTest() {
		PriorityQueue<String> p=new PriorityQueue<>();
		p.add("testing");
		p.add("sele");
		p.add("automation");
		p.add("selenium");	
		
		return p;
	}
	/*priority queue is used when objects are supposed to be processed based on priority.
	priority queue follow the concept of first-in-first-out algorithm.*/
	public static void main(String arg[]) {
		PriorityQueue<String> pp=new PriorityQueue<>();
		pp=priorityTest();
		Iterator<String> i=pp.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			if(i.equals("sele")) {
				i.remove();
				System.out.println("i element now :"+i);
			}
		}	
	}
}
