package co.in.Collection.Comprator;

import java.util.Comparator;

public class CompareByMarks implements Comparator<MarkSheet> {

	@Override
	public int compare(MarkSheet o1, MarkSheet o2) {

		return o1.marks - o2.marks;
	}

}
