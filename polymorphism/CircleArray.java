package co.in.polymorphism;

public class CircleArray extends ShapebyArray{
	private int redius;
	
	public static final double PI=3.14;
	public CircleArray(int redius) {
		this.redius=redius;
	}
	public double area() {
		double carea=PI*redius*redius;
		System.out.println("Circle area="+carea);
		return carea;
	}
}
