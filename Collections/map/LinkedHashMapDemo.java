package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		//Map<Integer,String> m=new LinkedHashMap<Integer,String>();
		HashMap<Integer,String> m=new LinkedHashMap<Integer,String>(10,0.5f,true);
		m.put(10, "ten");
		m.put(20, "Twenty");
		m.put(15, "Fifteen");
		System.out.println(m.put(15, "tyiftee"));
       
		System.out.println(m.get(10));
		System.out.println(m);
		m.put(20, "TWENTY");
		System.out.println(m);
		m.get(15);
		m.get(10);
		System.out.println(m);
	    Set<Map.Entry<Integer, String>> s= m.entrySet();
	    Iterator<Map.Entry<Integer, String>> it=s.iterator();
	    while(it.hasNext())
	    {
	    	Map.Entry<Integer,String> me= it.next();
	    	System.out.println(me.getKey()+"  "+me.getValue());
	    }
	    for(Map.Entry<Integer, String> i:s)
	    	System.out.println(i.getKey()+"   "+i.getValue());
        
	    String str="rththth";
	      str=str;
	     ArrayList<Integer> al=new ArrayList<>();
	     al.add(3);
	     System.out.println(al.remove(al.size()-1));
	     HashMap<Integer,Integer> hm=new HashMap<>();
	    
	  
	}

}
