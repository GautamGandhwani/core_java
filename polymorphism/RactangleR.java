package co.in.polymorphism;

public class RactangleR extends ShapeByReturn{
	public double length;
	public double width;
	
	public RactangleR(double length, double width) {
		this.length=length;
		this.width=width;
	}
	public double area() {
		return length*width;
	}
}
