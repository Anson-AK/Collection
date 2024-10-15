package set;

import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(10);
        hs.add(20);
        hs.add(5);
        hs.add(40);
        hs.add(22);
        hs.add(30);
        hs.add(35);
        System.out.println(hs.add(10));
        System.out.println(hs.add(20));
        System.out.println(hs);
        HashSet<String> hs1=new HashSet<>();
        System.out.println(hs1.add("ad"));
        System.out.println(hs1.add("da"));
        
	}

}
