package co.in.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(3);
		l.add(2);
		
		Iterator it = l.iterator();
		
		l.add(2);
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
