package co.in.abstracte;

public class Rectangle extends Shape {
	int length;
	int width;

	public Rectangle(int length, int width) {
		
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		double Area = length * width;
		System.out.println("Area = " + Area);
		return Area;
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(5, 3);
		r.area();
	}

}
