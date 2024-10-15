package set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
       lhs.add(11);
       lhs.add(10);
       lhs.add(20);
       lhs.add(9);
       System.out.println(lhs.add(10));
       lhs.add(28);
       System.out.println(lhs);
      
	}

}
