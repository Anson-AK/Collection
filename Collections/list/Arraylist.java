package list;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList pkl=new ArrayList(3);
       pkl.add("Punnaikayal");
       pkl.add("Thoothukudi");
       pkl.add(628151);
       System.out.println(pkl+" "+ pkl.size());
       ArrayList mnd=new ArrayList();
       mnd.add("Manapad");
       mnd.add("Thoothukudi");
       mnd.add("628209");
       System.out.println(mnd);
       System.out.println(pkl.addAll(mnd));
      System.out.println(pkl+" "+ pkl.size());
       Object o=pkl.clone();
       System.out.println(o);
       ArrayList<Integer> i=new ArrayList<>();
       i.add(100);
       i.add(200);
       i.add(300);
       ArrayList<Integer> i1=(ArrayList)i.clone();
       i1.add(400);
       i1.ensureCapacity(50);
       System.out.println("size "+i1.size());
       for(Integer in:i1)
    	   System.out.println(in);
       System.out.println(i);
      ArrayList<Integer> i2=new ArrayList<Integer>(i1);
      System.out.println(i2);
      for(int j=0;j<i2.size();j++)
    	  System.out.println(i2.get(j));
     Iterator<Integer> it=i.iterator();
	}

}
