package co.in.polymorphism;

public class TestArray {
	public static void main(String[] args) {
		ShapebyArray[] s =new ShapebyArray[3];
		
		s[0] = new RactangleArray(3,4);
		s[1] = new CircleArray(5);
		s[2] = new TriangleArray(5,6);
		
		double totalarea = calarea(s);
		System.out.println("Total Area="+totalarea);
	}

	private static double calarea(ShapebyArray[] s) {
		double totalarea = 0;
		for (int i = 0; i < s.length; i++) {
			totalarea += s[i].area();
		}
		return totalarea;
	}
}
	