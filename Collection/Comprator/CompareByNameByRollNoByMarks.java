package co.in.Collection.Comprator;

import java.util.Comparator;

public class CompareByNameByRollNoByMarks implements Comparator<MarkSheet> {

	@Override
	public int compare(MarkSheet o1, MarkSheet o2) {
		if (o1.name == o2.name) {

			return o1.marks - o2.marks;

		} else if (o1.marks == o2.marks) {

			return o1.name.compareTo(o2.name);

		} else {

			return o1.rollNo.compareTo(o2.rollNo);

		}
	}

}
