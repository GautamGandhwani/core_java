package co.in.oop;

import java.util.Scanner;

public class TestInheritanceConstructor {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your color :- ");
		String A = sc.next();
		
		System.out.print("Enter your boderwidth :- ");
		int B = sc.nextInt();
		
		System.out.print("Enter yuor length :- ");
		int C = sc.nextInt();
		
		System.out.print("Enter your width :- ");
		int D = sc.nextInt();
		
		RectangleConstructorChild r = new RectangleConstructorChild(A,B,C,D);
		System.out.println("color :- "+r.getColor());
		System.out.println("boderwidth :- "+r.getBoderwidth());
		System.out.println("length :- "+r.getLength());
		System.out.println("width :- "+r.getWidth());
		r.area();
		
		System.out.print("Enter your color :- ");
		String E = sc.next();
		
		System.out.print("Enter your boderwidth :- ");
		int F = sc.nextInt();
		
		System.out.print("Enter yuor redius :- ");
		int G = sc.nextInt();
		
		CircleConstructorChild c = new CircleConstructorChild(E,F,G);
		System.out.println("color :- "+c.getColor());
		System.out.println("boderwidth :- "+c.getBoderwidth());
		System.out.println("redius :- "+c.getRedius());
		c.area();
		
		System.out.print("Enter your color :- ");
		String H = sc.next();
		
		System.out.print("Enter your boderwidth :- ");
		int I = sc.nextInt();
		
		System.out.print("Enter yuor base :- ");
		int J = sc.nextInt();
		
		System.out.print("Enter your hioght :- ");
		int K = sc.nextInt();
		
		TriangleConstructorChild t = new TriangleConstructorChild(H,I,J,K);
		System.out.println("color :- "+t.getColor());
		System.out.println("boderwidth :- "+t.getBoderwidth());
		System.out.println("base :- "+t.getBase());
		System.out.println("hight :- "+t.getHight());
		t.area();
	}
}