package co.in.Collection;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceCollection {
	public static void main(String[] args) {
		Set s = new HashSet();

		s.add("abc");
		s.add(5);
		s.add(null);
		s.add(null);
		
		System.out.println(s);
	}
}
