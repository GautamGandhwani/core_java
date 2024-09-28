package co.in.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("Gautam");
		list.add(2);
		list.add("Gautam");
		
		System.out.println(list);
		
		Iterator it = list.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
