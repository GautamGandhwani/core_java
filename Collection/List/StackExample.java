package co.in.Collection.List;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		
		System.out.println(s);
		
		System.out.println(s.peek());
		
		System.out.println(s);
		
		System.out.println(s.pop());
		
		System.out.println(s);
	}
}
