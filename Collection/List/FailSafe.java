package co.in.Collection.List;

import java.util.Enumeration;
import java.util.Vector;

public class FailSafe {
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.addElement(4);
		v.addElement(6);;
		
		Enumeration e = v.elements();
		
		v.addElement(3);
		
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
