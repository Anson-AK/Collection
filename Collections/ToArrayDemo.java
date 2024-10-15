import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer> list1=new ArrayList<>();
     list1.add(10);
     list1.add(12);
     list1.add(11);
     list1.add(14);
     list1.add(15);
     list1.add(17);
     Integer []ar=new Integer[10];
     ar[0]=1200;
     ar[1]=1500;
      ar=list1.toArray(ar);
     Integer [] arr=list1.toArray(new Integer[0]);
     System.out.println(arr.length);
     Integer []array=new Integer[10];
     for(int i=0;i<5;i++)
    	 array[i]=i;
     List<Integer> list=Arrays.asList(array);
   System.out.println(list);
   
   array[5]=150;
   array[6]=500;
   System.out.println(list);
   System.out.println(list.contains(3));
   for(Integer i:arr)
	   System.out.println(i);
  System.out.println("Array ar");
   for(Integer i:ar)
	   System.out.println(i);
   int []ary=new int[5];
   for(int i=1;i<=5;i++)
	   ary[i-1]=i*100;
   int n= Arrays.stream(ary).max().getAsInt();
   
   
   
   String a="asd";
   String b="qwasd";
   char i;
   char c='a'^'a'^'b'^'b'^'b';
   System.out.println(a.hashCode());
   //a=a.concat(b);
   System.out.println(a);
   System.out.println(a.hashCode());
   System.out.println(b.contains(a));
   System.out.println(c);
	}

}
