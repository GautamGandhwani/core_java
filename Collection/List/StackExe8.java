package co.in.Collection.List;

import java.util.Stack;

public class StackExe8 {
	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		for (char ch = 'a'; ch <= 'z'; ch++) {
			s.push(ch);
		}
		System.out.println(s);
	
		Stack s1 = new Stack();
		
		while (!s.isEmpty()) {
			s1.push(s.pop());
//			System.out.println(s1);
		}
		System.out.println(s1);
		
	}
}
