package co.in.CollectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionInterfaceMethod {

	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add("Gautam");
		c.add(5);
		c.add("ram");

		Collection c1 = new ArrayList();

		c1.add("Gautam");
		c1.add(4);
		c1.add("ram");
		System.out.println("Add All = " + c1.addAll(c));

		System.out.println(c1+"\n");
		System.out.println("contains = " + c.contains("Gautam"));
		System.out.println(c+"\n");
		System.out.println("Contains all = " + c.containsAll(c));
		System.out.println(c+"\n");
		System.out.println("empty = " + c.isEmpty());
		System.out.println(c+"\n");
		System.out.println("remove element=" + c.remove(5));
		System.out.println(c+"\n");
		System.out.println("retain all= " + c.retainAll(c1));
		System.out.println(c+"\n");
		System.out.println("size= " + c.size());
		System.out.println(c);
		System.out.println("remove all="+c.removeAll(c));
		System.out.println(c+"\n");
		c.clear();
	}

}
