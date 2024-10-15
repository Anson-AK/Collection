package queue;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> q=new PriorityQueue<Integer>(Collections.reverseOrder());
		q.add(10);
		q.add(3);
		q.add(11);
		q.add(4);
		q.add(5);
		q.add(6);
		
		System.out.println(q.size());
		while(!q.isEmpty())
		{
			System.out.println("Poll "+q.poll());
	
		}
		/*Iterator<Integer> it=q.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		*/ 
	}

}
