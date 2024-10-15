package cursors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorDemo {

	public static void main(String[] args) {
		
		List<Character> lst=Arrays.asList('a','s','d','f','g','h','k','l');
		 ArrayList arr=new ArrayList<Character>(lst);
		 arr.add("word");
		 Spliterator spl=arr.spliterator();
		 int characteristics = spl.characteristics();
             System.out.println(characteristics);
	        if ((characteristics & Spliterator.ORDERED) != 0) {
	            System.out.println("ORDERED");
	        }
	        if ((characteristics & Spliterator.DISTINCT) != 0) {
	            System.out.println("DISTINCT");
	        }
	        if ((characteristics & Spliterator.SORTED) != 0) {
	            System.out.println("SORTED");
	        }
	        if ((characteristics & Spliterator.SIZED) != 0) {
	            System.out.println("SIZED");
	        }
	        if ((characteristics & Spliterator.NONNULL) != 0) {
	            System.out.println("NONNULL");
	        }
	        if ((characteristics & Spliterator.IMMUTABLE) != 0) {
	            System.out.println("IMMUTABLE");
	        }
	        if ((characteristics & Spliterator.CONCURRENT) != 0) {
	            System.out.println("CONCURRENT");
	        }
	        if ((characteristics & Spliterator.SUBSIZED) != 0) {
	            System.out.println("SUBSIZED");
	        }
	        System.out.println(arr);
	        System.out.println(Integer.MAX_VALUE);
	}

}
