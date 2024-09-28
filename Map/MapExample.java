package co.in.Map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put(1,"One");
		m.put(2,"Two");
		m.put(3,"Three");
		
		System.out.println(m.get(3));
		System.out.println(m.containsKey(2));
		System.out.println(m.entrySet());
		System.out.println(m.keySet());
	}
}
