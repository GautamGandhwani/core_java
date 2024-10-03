package co.in.Collection.Comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {

		List<MarkSheet> list = new ArrayList<MarkSheet>();

		list.add(new MarkSheet("101", "Ram", 56));
		list.add(new MarkSheet("105", "Raman", 56));
		list.add(new MarkSheet("103", "Ghanshyam", 56));
		list.add(new MarkSheet("104", "Aaman", 56));
		list.add(new MarkSheet("106", "Kamlesh", 56));
		list.add(new MarkSheet("102", "Baldev", 56));

		/*
		 * CompareByName name = new CompareByName();
		 * 
		 * System.out.println("compare by name : "); 
		 * Collections.sort(list, name);
		 * list.forEach(System.out::println);
		 * 
		 * CompareByMarks marks = new CompareByMarks();
		 * 
		 * System.out.println("compare by marks : ");
		 * Collections.sort(list, marks);
		 * list.forEach(System.out::println);
		 */

		CompareByNameByRollNoByMarks c = new CompareByNameByRollNoByMarks();
		Collections.sort(list, c);
		list.forEach(System.out::println);

	}

}
