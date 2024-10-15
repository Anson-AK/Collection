package generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemoRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          GenericsDemo<Integer> gd=new GenericsDemo<Integer>();
          GenericsDemo<Float> fd=new GenericsDemo<Float>();
          ArrayList<Integer> d=new ArrayList<Integer>();
          ArrayList<Float> f=new ArrayList<Float>();
          for(int i=1;i<6;i++)
        	  d.add(i);
          for(int i=1;i<6;i++)
          {
        	  float n=(float) (i*0.2);
        	  f.add(n);
          }
          gd.display(d);
          fd.display(f);
          ArrayList<Integer> dec=new ArrayList<>();
          dec.add(10);
          dec.add(29);
          dec.add(20);
          dec.add(30);
          dec.add(40);
          System.out.println(d);
          d=dec;
          System.out.println(d);
          System.out.println(dec);
          Iterator<Integer> it=dec.iterator();
          while(it.hasNext())
          {
        	 System.out.println(it.next());
        	 it.remove();
        	 it.remove();
          }
	}

}
