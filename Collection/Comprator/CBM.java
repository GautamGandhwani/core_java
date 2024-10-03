package co.in.Collection.Comprator;

import java.util.Comparator;

public class CBM implements Comparator<mark>{

	@Override
	public int compare(mark o1,mark o2) {
		return o1.m-o2.m;
	}
	

	
}
