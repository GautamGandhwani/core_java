package co.in.Collection.Comprator;

import java.util.Comparator;

public class CBNBRBM implements Comparator<mark>{

	@Override
	public int compare(mark o1, mark o2) {
		if (o1.name == o2.name) {
			
			return o1.m - o2.m;
		
		} else if (o1.m == o2.m) {
		
			return o1.name.compareTo(o2.name);
		
		}else {
		
			return o1.rNo.compareTo(o2.rNo);
		
		}	
	}	
}