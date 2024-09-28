package co.in.Collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		
		TreeSet s = new TreeSet();
		
		s.add("Gautam");
		s.add("Mohit");
		s.add("Gourav");
		s.add("Sandeep");
		
		System.out.println(s);
		
		Iterator it = s.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
