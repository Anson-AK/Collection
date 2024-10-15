package stack_package;

import java.util.ArrayDeque;

public class StockSpan {

	public static void main(String[] args) {
		
		int []num= {60,10,20,40,35,30,50,70,65};
        int []arr =new int[num.length];
        ArrayDeque<Integer> ad=new ArrayDeque<>();
		 //ad.push(0);
		 //arr[0]=1;
		 for(int i=0;i<num.length;i++)
		 {
			 while(!ad.isEmpty()&&num[ad.peek()]<=num[i])
			 {
				 ad.pop(); 
			 }
			 arr[i]=(ad.isEmpty())?(i+1):(i-ad.peek());
			 ad.push(i);
		 }
		 for(int i:arr)
			 System.out.print(i+"  ");
		System.out.println("ss");
		System.out.print("ddd");

		  }
		  
		  
      	}
	


