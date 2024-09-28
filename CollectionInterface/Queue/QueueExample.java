package co.in.CollectionInterface.Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		
		Queue q = new ArrayDeque();
		
		q.offer("ram");
		q.offer(4);
		q.offer(5.2);
		
		System.out.println(q.peek());
		System.out.println(q);
		
	}
}
