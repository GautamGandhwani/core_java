package co.in.polymorphism;

public class Test {
	public static void main(String[] args) {
		Shape s=new Circle(5);
		Shape s1=new Rectangle(4,3);
		Shape s2=new Triangle(7,5);
		
		System.out.println("Circle = "+s.area());
		System.out.println("Rectangle = "+s1.area());
		System.out.println("Triangle = "+s2.area());
	}
}
