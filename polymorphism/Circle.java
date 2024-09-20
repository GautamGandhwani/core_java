package co.in.polymorphism;

public class Circle extends Shape{
	public double redius; 
	public final double PI=3.14;
		
	public Circle(double redius) {
		this.redius=redius;
	}
	public double area() {
		return PI*redius*redius;
	}
}
