package co.in.Collection.Comprator;

import java.util.Comparator;

public class CBN implements Comparator<mark>{

	@Override
	public int compare(mark o1, mark o2) {
		return o1.name.compareTo(o2.name);
	}
	
}