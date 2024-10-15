package stack_package;

import java.math.BigInteger;
import java.util.*;



public class Profit {
    public static int profit(ArrayList<Integer> V)
    {
    	   ArrayDeque<Integer> stack=new ArrayDeque<>(); 
           /*  int pro=V.get(V.size()-1);
             stack.push(V.get(V.size()-1));
             
             for(int i=V.size()-2;i>=0;i--)
             {
                 while(!stack.isEmpty()&&stack.peek()<V.get(i))
                 {
                     stack.pop();
                 }
                 pro+=stack.isEmpty()?V.get(i):stack.peek()-V.get(i);
                 stack.push(V.get(i));
             }*/
             int pro=0;
             stack.push(V.get(0));
             for(int i=1;i<V.size();i++)
             {
                 while(!stack.isEmpty()&&stack.peek()<=V.get(i))
                 {
                     pro+=V.get(i)-stack.pop();
                 }
                 stack.push(V.get(i));
             }
             while(!stack.isEmpty())
              pro+=stack.pop();
             return pro;
    }
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(1);
		Iterator<Integer> it= list.iterator();
        int i=list.size()-1;
		while(i>=0)
		{			System.out.println(it.next());
		          i--;
		}
		System.out.println(profit(list));
	

	}

}
