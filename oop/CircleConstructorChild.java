package co.in.oop;

public class CircleConstructorChild extends ShapeConstructorParent{
	private int redius;

	public int getRedius() {
		return redius;
	}
	
	public CircleConstructorChild(String color,int boderwidth,int redius) {
		super(color,boderwidth);
		this.redius=redius;
	}
	
	public void area() {
		double y=3.14*redius*redius;
		System.out.println("Area of circle :- "+y+"\n");
	}

}
