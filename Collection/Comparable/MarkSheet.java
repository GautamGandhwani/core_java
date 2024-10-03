package co.in.Collection.Comparable;

public class MarkSheet implements Comparable<MarkSheet> {

	public String rollNo;
	public String name;
	public int marks;

	public MarkSheet(String r, String n, int m) {
		this.rollNo = r;
		this.name = n;
		this.marks = m;
	}

	public int compareTo(MarkSheet m) {
		return this.marks - m.marks;
	}

	public String toString() {
		return rollNo + "," + name + "," + marks;
	}
}
