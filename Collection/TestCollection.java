package co.in.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		Collection c =new ArrayList();
		
		c.add(4);
		c.add("hello");
		c.add(3.2);
		c.add('a');
		c.add(null);
		System.out.println(c);
	}
}
