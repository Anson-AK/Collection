package cursors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class CursorsDemo {

	void iteratorDemo()
	{
		System.out.println("******Iterator Demo*******");
		List<Integer> ar=Arrays.asList(1,2,2,3,4,5,6,7,8);
		ArrayList<Integer> al=new ArrayList<>(ar);
		al.add(100);
		Iterator<Integer> it=al.iterator();
		
		
		 while(it.hasNext()) { System.out.println(it.next()); } 
			/*
			 * System.out.println("forEachRemaining");
			 * iterator point last position so it is not work
			 * it.forEachRemaining(n->System.out.println(n));
			 */
	}
	void listIterators()
	{
		 System.out.println("******List Iterator********");
		 List<Integer> ar=Arrays.asList(11,22,33,44,55,66,77,88);
		 ArrayList<Integer> arr=new ArrayList<Integer>(ar);
		 ListIterator<Integer> li=arr.listIterator();
		 
			
	  while(li.hasNext()) {
		 System.out.println("li.nextIndex():  "+li.nextIndex()+"   li.next():  "+li.next());
			  
		} System.out.println("li.nextIndex() :"+li.nextIndex());
			  
			  
			  while(li.hasPrevious()) {
			  System.out.println("li.previousIndex():  "+li.previousIndex()
			  +"   li.previous():  "+li.previous()); }
			    	
		 System.out.println("Before remove() and set()"+arr);
		 while(li.hasNext())
	   	{
			 int n=li.next();
			 
	   		if(n%3==0)
	   			{
	   			li.set(100);
	   			}
	   	
	   		if(n%6==0)
	   			li.remove();
	   	}

		 System.out.println("After remove() and set()"+arr);
	}
	public static void main(String[] args) {
		CursorsDemo cd=new CursorsDemo();
		cd.iteratorDemo();
		cd.listIterators();
		
		
	}

}
