package co.in.Collection.Comprator;

public class mark {
	public String rNo;
	public String name;
	public int m;
	
	public mark(String r,String n,int m) {
		this.rNo = r;
		this.name = n;
		this.m = m;
	}
	public String toString() {
		return rNo+","+name+","+m;
	}
}
