package co.in.polymorphism;

public class ShapeByReturn {
	public ShapeByReturn() {
		
	}
	public double area() {
		return 0;
	}
	public static ShapeByReturn getShapeByReturn(int i) {
		if (i==1) {
			return new RactangleR(4,6);
		}
		if (i==2) {
			return new TriangleR(6,9);
		}
		if (i==3) {
			return new CircleR(5);
		}
		return new ShapeByReturn();
	}
}
