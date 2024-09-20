package co.in.polymorphism;

public class CircleR extends ShapeByReturn{
	public double redius; 
	public final double PI=3.14;
		
	public CircleR(double redius) {
		this.redius=redius;
	}
	public double area() {
		return PI*redius*redius;
	}
}
