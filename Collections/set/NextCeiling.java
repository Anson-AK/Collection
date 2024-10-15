package set;

import java.util.TreeSet;

public class NextCeiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[] = {10, 5, 11, 10, 20, 12};
         int n=arr.length;
         TreeSet<Integer> ts=new TreeSet<>();
         int []c=new int[n];
         
         for(int i=n-1;i>=0;i--)
         {
        	
        	 if(ts.ceiling(arr[i])==null)
        	 {
        		 c[i]=-1;
        	 }
        	 else
        		 c[i]=ts.ceiling(arr[i]);
        	 
        	 ts.add(arr[i]);	 
         }
         for(int i:c)
        	 System.out.print(i+" ");
         
	}

}
