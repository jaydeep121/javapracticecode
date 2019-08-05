package com.advancejava.collection;

import java.util.PriorityQueue;

public class QueueConcept {
	
	/*Queue: [1.5v Enhancements (Queue(I)) :it is the child interface of collection]
	 * use of queue :if we want to represent a group of individual objects prior to processing then
	 * we should for queue. for example before sending SMS message all mobile number we have to store
	 * in some data structure in which order we added mobile number in the same order only message 
	 * should be delivered for this first in first out requirement queue is the best choice
	 * 
	 * Usually queue first in first out but based on our requirement we can implement out own priority
	 * order also(Priority queue), from 1.5v onwards linked list class also implements queue(I).\
	 * LinkedList based implementation always follow first-in-first-out order
	 * 
	 * Queue(I) Specific Methods:
	 * 1: boolean offer(Object o) : to add an object into the queue 
	 * 2: Object peek :To return head element if the queue. if queue is empty then this method  
	 *    returns null
	 *    
	 * 3: Object Element() : To return head element of queue. if queue is empty then this method 
	 *    raise RE : NoSuchElementException 
	 * 4: Object pool() : to remove and return head element of the queue. if queue is empty them this
	 *    method returns null.
	 * 5: Object remove() : to remove and return head element of the queue. if queue is empty then this
	 *    method returns Re : NoSuchElementException   
	 *       
	 * /
	 */
	public static  void priorityQueue() { //prior to processing 
		PriorityQueue pq=new PriorityQueue();
		//System.out.println(pq.peek());//null
		//System.out.println(pq.element());//RE
		for(int i=0;i<=10;i++) {
			pq.offer(i);
		}
		System.out.println(pq);//[0,1,2...10]
		System.out.println(pq.poll());//0
		System.out.println(pq);//[1,2...10]	
	}
	public static void main(String arg[]) {
		QueueConcept q=new QueueConcept();
		priorityQueue();
	}
	
	
	

}
