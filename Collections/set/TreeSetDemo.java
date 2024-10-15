package set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
 
	public static void main(String[] args)
	{
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(30);
		ts.add(5);
		ts.add(20);
		ts.add(12);
		ts.add(30);
		ts.add(43);
		ts.add(34);
		System.out.println(ts);
		System.out.println(ts.ceiling(43));
		System.out.println(ts.floor(40));
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.higher(5));
		System.out.println(ts.lower(10)+"\n");
		Iterator<Integer> di=ts.descendingIterator();
		while(di.hasNext())
		{
			System.out.print(di.next()+"  ");
		}
		TreeSet<Integer> trs=(TreeSet<Integer>) ts.descendingSet();
		System.out.println(trs);
		System.out.println(ts.headSet(20));
     	Set<Integer> tree= ts.headSet(30,true);
     	System.out.println(tree);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
