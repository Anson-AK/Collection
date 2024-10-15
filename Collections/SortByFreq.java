import java.io.*;
import java.util.*;
class SortByFreq {

	static void sortByFreq(int[] arr)
	{
		Map<Integer,Integer> m = new HashMap<>();

		for(int i=0; i<arr.length; i++)
		{
			m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
		}
		int n =arr.length;
		List<List<Integer>>  freq = new ArrayList<>();

		for(int i=0; i<=n; i++)
		{
			freq.add(new ArrayList<>());
		}

		for(Map.Entry<Integer,Integer> e: m.entrySet())
		{
			freq.get(e.getValue()).add(e.getKey());
		}
      
		int index =0;

		for(int i=n; i>=0; i--)
		{
			for(int x: freq.get(i))
			{
				
				for(int j =0; j<i; j++)
				{
				System.out.print(x+" ");
					arr[index++] = x;
				}
				System.out.println();
			}
		}
	}
	public static void main (String[] args) {
		
		int[] arr = {10, 5, 20, 5, 10, 10, 5, 20,12,12};
        System.out.println();
		sortByFreq(arr);
		
	

		for(int i=0;i<arr.length;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
}
