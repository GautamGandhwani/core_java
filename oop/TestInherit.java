package co.in.oop;

import java.util.Scanner;

public class TestInherit {
	public static void main(String[] args) {
		CircleChild c=new CircleChild();
		RectangChild r = new RectangChild();
		TriangleChild t = new TriangleChild();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Boder Width :- ");
		int a= sc.nextInt();
		
		c.setBorderWidth(a);
		System.out.println("Border Width :- "+c.getBorderWidth());
		
		System.out.print("Enter your color :- ");
		String b= sc.next();
		
		c.setColor(b);
		System.out.println("Colour :- "+c.getColor());

		System.out.print("Enter your redius :- ");
		int d= sc.nextInt();
		
		c.setRedius(d);
		System.out.println("Redius of circal :- "+c.getRedius());
		c.area();

		System.out.print("Enter your length :- ");
		int e= sc.nextInt();
		
		r.setLength(e);
		System.out.println("Length of rectangle :- "+r.getLength());

		System.out.print("Enter your  width :- ");
		int f= sc.nextInt();
		
		r.setWidth(f);
		System.out.println("Width of rectangle :- "+r.getWidth());
		r.area();
		
		System.out.print("Enter your higth :- ");
		int g= sc.nextInt();
		
		t.setHigth(g);
		System.out.println("Higth of triangle :- "+t.getHigth());

		System.out.println("Enter your base :- ");
		int h= sc.nextInt();
		
		t.setBase(h);
		System.out.println("Base of triangle :- "+t.getBase());
		t.area();
	}
}
