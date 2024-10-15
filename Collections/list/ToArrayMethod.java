package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Integer> l= Arrays.asList(11,22,33,44,55,66,77);
       ArrayList<Integer> arl=new ArrayList<Integer>(l);
       ArrayList list=new ArrayList<>();
       list.add(1);
       list.add("Victory");
       list.add(22.232);
       list.add('A');
       list.add(true);
       list.add(299900000l);
       System.out.println("***Object[] arr= arl.toArray()***");
       Object[] arr= list.toArray();
       for(Object i:arr)
    	   System.out.println(i);
       System.out.println("***arl.toArray(arr1)***");
       Integer[] arr1=new Integer[arl.size()];
       arl.toArray(arr1);
       for(Integer i:arr1)
    	   System.out.println(i);
       //Integer[] arr2=arl.toArray(n->new Integer[n]);
       System.out.println("***arl.toArray(Integer[]::new)***");
       Integer[] arr2=arl.toArray(Integer[]::new);
       for(int i:arr2)
    	   System.out.println(i);
    
	}

}
