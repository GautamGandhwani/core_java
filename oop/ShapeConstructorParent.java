package co.in.oop;

public class ShapeConstructorParent {
	protected String color;
	protected int boderwidth;
    
	public ShapeConstructorParent() {
		System.out.println("I am default constrctor");
	}

	public String getColor() {
		return color;
	}

	public int getBoderwidth() {
		return boderwidth;
	}
	
	public ShapeConstructorParent(String color,int boderwidth) {
		this.color = color;
		this.boderwidth = boderwidth;
	}
}