package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Integer, String> hm=new HashMap();
        hm.put(0,"jeswin");
        hm.put(1, "Queensha");
        hm.put(2,"Thimna");
        hm.put(3,"mersha");
        hm.put(4,"jebisha");
        hm.put(6,"preesha");
        
        Set<Map.Entry<Integer, String>> es=hm.entrySet();
        Collection vc=hm.values();
         Set ks=hm.keySet();
        System.out.println("Entry Set "+es);
        System.out.println("Values Collection "+vc);
        System.out.println("Key Set"+ks);
        System.out.println(hm.get(3));
      
        System.out.println(hm.isEmpty());
              Iterator it=es.iterator();
              while(it.hasNext())
              {
            	  System.out.println(it.next());
              }
              System.out.println(hm.getOrDefault(6, "200"));
        
        
	}

}
