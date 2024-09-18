package co.in.oop;

public class RectangleConstructorChild extends ShapeConstructorParent {
	private int length;
	private int width;
	
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	public RectangleConstructorChild(String color,int boderwidth,int length, int width) {
		super(color,boderwidth);
		this.length=length;
		this.width=width;
	}
	
	public  void area () {
		int x= length*width;
		System.out.println("Area of rectangle :- "+x+"\n");
	}

}