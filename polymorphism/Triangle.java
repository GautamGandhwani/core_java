package co.in.polymorphism;

public class Triangle extends Shape{
	private int base;
	private int hight;
	
	public Triangle(int base, int hight) {
		this.base=base;
		this.hight=hight;
	}
	public double area() {
		return 0.5*base*hight;
	}
}
