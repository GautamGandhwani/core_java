package co.in.oop;

public class CircleChild extends Shapeparent{
	
	private int redius;

	public int getRedius() {
		return redius;
	}

	public void setRedius(int redius) {
		this.redius = redius;
	}
	public void area() {
		double z =3.14*redius*redius;
		System.out.println("Area of cricle :- "+z+"\n");
	}
}
