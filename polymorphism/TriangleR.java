package co.in.polymorphism;

public class TriangleR extends ShapeByReturn{
	private int base;
	private int hight;
	
	public TriangleR(int base, int hight) {
		this.base=base;
		this.hight=hight;
	}
	public double area() {
		return 0.5*base*hight;
	}
}
