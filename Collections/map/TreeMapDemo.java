package map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class TreeMapDemo {

	 static public void main(String[] args) {
		// TODO Auto-generated method stub
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        tm.put(1, 100);
        tm.put(2,200);
        tm.put(5, 500);
        tm.put(1, 300);
        tm.put(6, 600);
        tm.put(4, 400);
        
        
        System.out.println(tm);
        System.out.println(tm.ceilingKey(4));
        System.out.println(tm.higherKey(4));
        System.out.println(tm.lowerKey(5));
        System.out.println(tm.floorKey(5));
        System.out.println(tm.descendingKeySet());
        int k=0;
        Collection<Integer> l=tm.values();
        for(Integer i:l) {
        	System.out.println(i);
        	if(k==2) break;
        	k++;
        }
        HashMap<ArrayList<Integer>,String> hm=new HashMap<>();
        hm.put(new ArrayList<>(), "list 1");
        ArrayList<Integer> al=new ArrayList<>();
        al.add(100);
        al.add(200);
       al.add(101);
       al.add(103);
       al.stream()
       .filter(n->n%2==1).forEach(n->System.out.println(n));;
       System.out.println(al);
       
       
	}

}
