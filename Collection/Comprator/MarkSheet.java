package co.in.Collection.Comprator;

public class MarkSheet {

	public String rollNo;
	public String name;
	public int marks;

	public MarkSheet(String r, String n, int m) {
		this.rollNo = r;
		this.name = n;
		this.marks = m;
	}

	public String toString() {
		return rollNo + "," + name + "," + marks;
	}

}
