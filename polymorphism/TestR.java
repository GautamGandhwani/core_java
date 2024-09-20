package co.in.polymorphism;

public class TestR {
	public static void main(String[] args) {
		ShapeByReturn s1=ShapeByReturn.getShapeByReturn(1);
		ShapeByReturn s2=ShapeByReturn.getShapeByReturn(2);
		ShapeByReturn s3=ShapeByReturn.getShapeByReturn(3);
		
		System.out.println("Rectangle="+s1.area());
		System.out.println("Triangle="+s2.area());
		System.out.println("Circle="+s3.area());
	}
}
