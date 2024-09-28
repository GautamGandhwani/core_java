package co.in.Collection.Set;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
	public static void main(String[] args) {
		
		SortedSet s = new TreeSet();
		
		s.add("1");
		s.add("2");
		s.add("5");
		s.add("4");
		s.add("3");
		
		System.out.println(s.first());
		System.out.println(s.last());
		
		System.out.println(s);
		
		Iterator it = s.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}