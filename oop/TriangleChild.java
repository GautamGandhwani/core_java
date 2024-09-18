package co.in.oop;

public class TriangleChild extends Shapeparent{
	private int base;
	private int higth;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHigth() {
		return higth;
	}
	public void setHigth(int higth) {
		this.higth = higth;
	}
	public void area() {
		int x = (base*higth)/2;
		System.out.println("Area of triangle :- "+x+"\n");
	}
}
