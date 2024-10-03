package co.in.Collection.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarkSheetSorting {
	public static void main(String[] args) {

		List<MarkSheet> list = new ArrayList<MarkSheet>();

		list.add(new MarkSheet("101", "Ram", 82));
		list.add(new MarkSheet("105", "Shyam", 56));
		list.add(new MarkSheet("103", "Ghanshyam", 99));
		list.add(new MarkSheet("104", "Aaman", 55));
		list.add(new MarkSheet("106", "Kamlesh", 78));
		list.add(new MarkSheet("102", "Baldev", 23));

		Collections.sort(list);

		list.forEach(System.out::println);

	}
}