package co.in.Collection.List;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
	
		Vector v = new Vector();
		
		v.addElement("Gautam");
		v.addElement(3);
		v.addElement(5);
		v.addElement(6);
		
		System.out.println(v);
		
		Iterator it =v.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}