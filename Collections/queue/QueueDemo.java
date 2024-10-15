package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
 class QueueDemo {

	private int ab;
	private class data{
		
	}
	private void print()
	{
		System.out.println("print is work");
	}
	data d=new data();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Queue<Integer> q=new LinkedList<>();
         for(int i=1;i<11;i++)
        	 q.add(i);
         System.out.println("q.offer(20) :"+q.offer(20));
         System.out.println(q);
         System.out.println("q.poll()  :"+q.poll());
         System.out.println(q);
         System.out.println("q.peek()  :"+q.peek());
         System.out.println(q);
         System.out.println(q.element());
         q.addAll(q);
         System.out.println(q);
         Queue<Integer> q1=new LinkedList<>();
         for(int i=7;i<11;i++)
        	 q1.add(i);
         q.retainAll(q1);
         System.out.println(q);
         Iterator<Integer> it=q.iterator();
         while(it.hasNext())
        	 System.out.println(it.next());
         System.out.println(q.poll());
         
         QueueDemo qd=new QueueDemo();
         qd.ab=100;
         qd.print();
         QueueDemo qd1=qd;
         System.out.println(qd.equals(qd1));
        int in=4;
        System.out.println(in);
               
               
	}

}
