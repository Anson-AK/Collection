package linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistDemo {
 
	private String str;
	public LinkedlistDemo(String string) {
		str=string;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList<Integer> l=new LinkedList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        System.out.println(l);
        System.out.println("l.contains(3)->"+l.contains(3));
        System.out.println("l.contains(30)->"+l.contains(30));
        LinkedList<Integer> l1=new LinkedList<Integer>(Arrays.asList(10,20,30,40));
        System.out.println(l.addAll(l1));
        System.out.println("l->"+l);
        System.out.println("l.peek() :"+l.peek());
        System.out.println("l.peekFirst() :"+l.peekFirst());
        System.out.println("l.peekLast() :"+l.peekLast());
        System.out.println("Before offer() l1->"+l1); 
        System.out.println("l1.offer(5) :"+l1.offer(5));
        System.out.println("After offer() l1->"+l1); 
        System.out.println("l1.offerFirst(2) "+l1.offerFirst(2));
        System.out.println(l1);
        System.out.println("l1.offerLast(100) "+l1.offerLast(100));
        System.out.println(l1);
        System.out.println("l1.poll(): "+l1.poll()+"\n"+l1);
        System.out.println("l1.pollFirst(): "+l1.pollFirst()+'\n'+l1);
        System.out.println("l1.pollLast(): "+l1.pollLast()+"\n"+l1);
        l1.addAll(l);
        System.out.println(l1);
        l1.set(3,50);
        System.out.println(l1);
        
        System.out.println("l1.removeFirstOccurance(): "+l1.removeFirstOccurrence(20)+"\n"+l1);
        System.out.println("l1.removeLastOccurance(): "+l1.removeLastOccurrence(30)+"\n"+l1);
        //System.out.println("l1.removeLast(): "+l1.removeLast()+"\n"+l1);
        System.out.println("l1.remove(): "+l1.remove()+"\n"+l1);
        System.out.println("l1.removeFirst(): "+l1.removeFirst()+"\n"+l1);
        System.out.println("l1.removeLast(): "+l1.removeLast()+"\n"+l1);
        System.out.println(l1.equals(l));
        LinkedlistDemo ld=new LinkedlistDemo("list");
        LinkedlistDemo ld1=new LinkedlistDemo("list");
        System.out.println(ld.equals(ld1));
        
        
        
	}
	public boolean equals(Object o)
	{
		//LinkedlistDemo s=(LinkedlistDemo)o;
		//return this.str.equals(s.str);
		return this.toString().equals(o.toString());
	}
    public String toString()
    {
    	return str;
    }
}
