package co.in.polymorphism;

public class RactangleArray extends ShapebyArray{
	private int length;
	private int width;
	
	public RactangleArray(int length, int width) {
		this.length=length;
		this.width=width;
	}
	
	public double area() {
		double rarea = length*width;
		System.out.println("Ractangle area="+rarea);
		return rarea;
	}
}
