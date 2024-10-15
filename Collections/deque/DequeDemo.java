package deque;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DequeDemo {

	public static void main(String[] args) {
		Deque<Integer> dq=new ArrayDeque<>();
		
		dq.push(10);
		dq.push(20);
		dq.push(30);
		System.out.println(dq);
		dq.add(11);
		System.out.println(dq);
		//System.out.println(dq.remove());
		System.out.println(dq.pop());
		dq.forEach(n->System.out.println("-->"+n));
  Deque<Integer> dq1=new ArrayDeque<>();
		
		dq1.add(10);
		dq1.add(20);
		dq1.add(30);
		System.out.println(dq1);
		//dq1.push(11);
		System.out.println(dq1);
		System.out.println(dq1.peek());
		//System.out.println(dq1.remove());
		System.out.println(dq1.pop());
		dq1.forEach(n->System.out.println("-->"+n));
		dq1.push(40);
        System.out.println(dq1);
		ArrayDeque <Integer> ad=new ArrayDeque<>();
		ad.push(0);
		System.out.println(ad.isEmpty());
		Queue<Integer> stack=new ArrayDeque<Integer>();
	}

}
