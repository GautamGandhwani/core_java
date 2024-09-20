package co.in.polymorphism;

public class TriangleArray extends ShapebyArray{
	private int base;
	private int hight;
	
	public TriangleArray(int length, int width) {
		this.base=base;
		this.hight=hight;
	}
	
	public double area() {
		double tarea = 0.5*base*hight;
		System.out.println("Ractangle area="+tarea);
		return tarea;
	}
}
