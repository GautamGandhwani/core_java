package co.in.oop;

public class RectangChild extends Shapeparent{
	private int length;
	private int width;
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void area() {
	    int y=length*width;
		System.out.println( "Area of rectangle :- " +y+"\n");
   }
}