package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;


public class ArraylistMethods extends ArrayList<Integer>{

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		al.add(11);
		al.add(2,10);
		System.out.println("al  :"+al);
        ArrayList<Integer> al2=new ArrayList<Integer>(5);
        al2.addAll(Arrays.asList(11,22,33,44,55));
        System.out.println("al2  :"+al2);
        al2.addAll(3,al);
        System.out.println("al2  :"+al2);
        ArraylistMethods alr=new ArraylistMethods();
        alr.addAll(al2);
        alr.remove(10);
        alr.remove(Integer.valueOf(22));
        System.out.println("alr  :"+alr);
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.remove("Banana");
        System.out.println(list);
        alr.removeRange(2, 4);
        System.out.println(alr);
        Predicate<Integer> pr=n->(n%3==0)?true:false;
        alr.removeIf(pr);
        System.out.println(alr);
        ArrayList<Integer> al3=(ArrayList<Integer>) al2.clone();
        System.out.println(al3);
        //al2.clear();
        //System.out.println(al2);
        System.out.println(al3.contains(33));
        al3.ensureCapacity(10);
        System.out.println(al3.size());
        al.forEach(n->System.out.println("al: "+n));
        System.out.println(al3.indexOf(11));
        System.out.println(al3.lastIndexOf(11));
        System.out.println(al3.isEmpty());
        System.out.println(al3.get(5));
        System.out.println(al3.set(5, 100));
        System.out.println(al3);
        al3.retainAll(al);
        System.out.println(al3);
        ArrayList<Integer> al4=new ArrayList<Integer>(Arrays.asList(7,31,6,41,57));
       System.out.println(al.retainAll(al4));
       System.out.println(al);
       List<Integer> al5= al3.subList(1, 5);
       System.out.println(al5);
       
       Object[] arr= al4.toArray();
       //Integer[] iar=(Integer[])arr;    		   
       System.out.println(arr[3]);
       Integer[] arr1=new Integer[10];
       al4.toArray(arr1);
       for(Integer i:arr1)
    	   System.out.print(i+"  ");
     
        al4.trimToSize();
        al4.sort(new Comparator<Integer>(){
        	public int compare(Integer a,Integer b)
        	{
        		return a-b;
        	}
        });
        System.out.println("\n"+al4);
        System.out.println(al4.toString());
        Integer []arr2=new Integer[10];
        arr2[0]=10;
        arr2[1]=20;
        for(Integer i:arr2)
        	System.out.print(i+"  ");
           System.out.println("\nAfter");
        Integer[] arr3=al4.toArray(arr2);
       
        for(Integer i:arr2)
        	System.out.print(i+"  ");
     
        int []ard={1,2};
        System.out.println(ard[0]+","+ard[1]);
        
        ArrayList<String> strlist=new ArrayList<>();
        strlist.add("one");
        strlist.add("two");
        strlist.add("three");
        String[] strarray;
        
      strarray=strlist.toArray(new String[0]);
        for(String s:strarray)
        	 System.out.println(s);
        
       
      
        
        
        
        

	}

}
