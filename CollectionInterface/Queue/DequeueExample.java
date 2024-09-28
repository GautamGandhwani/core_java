package co.in.CollectionInterface.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExample {
	public static void main(String[] args) {
		
		Deque d = new ArrayDeque();
		
		d.offerLast(5);
		d.offerFirst(4);
		d.offerFirst(3);
		
		System.out.println(d);
		
		System.out.println(d.peekFirst());
		
		System.out.println(d);
		
		System.out.println(d.pollLast());
		
		System.out.println(d);
	}
}
