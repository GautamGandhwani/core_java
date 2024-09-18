package co.in.oop;

public class TriangleConstructorChild extends ShapeConstructorParent{
	private int base;
	private int hight;
	
	public int getBase() {
		return base;
	}
	public int getHight() {
		return hight;
	}
	
	public TriangleConstructorChild(String color,int boderwidth,int base, int hight) {
		super(color,boderwidth);
		this.base=base;
		this.hight=hight;
	}

	public void area() {
		double z=(base*hight)/2;
		System.out.println("Area of triangle :- "+z+"\n");
	}
}
