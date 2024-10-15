package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class GenerateNumberGivenDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q=new ArrayDeque<String>();
          int a=2;
          int b=3;
          Integer i=a;
          Integer j=b;
         q.add(i.toString());
         q.add(j.toString());
         int n=20;
         
         for(int i1=0;i1<n;i1++)
         {
        	 String current=q.poll();
        	 System.out.println(current+"  ");
        	 q.add(current+"2");
        	 q.add(current+"3");
         }
		
	}

}
