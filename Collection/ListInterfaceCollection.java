package co.in.Collection;


import java.util.ArrayList;
import java.util.List;

public class ListInterfaceCollection {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(0,2.3);
		list.add(1,4);
		list.add(2,"Gautam");
		list.add(3,null);
		list.add(4,null);
		System.out.println(list);
	}
}
