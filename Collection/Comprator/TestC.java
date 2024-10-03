package co.in.Collection.Comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestC {
	public static void main(String[] args) {
		
		List<mark> l = new ArrayList<mark>();
		
		l.add(new mark("1001","Yash",78));
		l.add(new mark("1003","Ram",87));
		l.add(new mark("1005","Sandeep",95));
		l.add(new mark("1004","Yash",78));
		l.add(new mark("1002","Raj",52));
		
//		CBN name = new CBN();
//		
//		System.out.println("compare by name : ");
//		Collections.sort(l,name );
//		l.forEach(System.out::println);
//		
//		CBM m = new CBM();
//		
//		System.out.println("compare by mark : ");
//		Collections.sort(l,m );
//		l.forEach(System.out::println);
		
		CBNBRBM c = new CBNBRBM();
		
		Collections.sort(l,c);
		l.forEach(System.out::println);
	}
}
