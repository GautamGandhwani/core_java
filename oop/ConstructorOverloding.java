package co.in.oop;

public class ConstructorOverloding {
	
	public ConstructorOverloding() {
		System.out.println("I am default constructor.");
	}
	public ConstructorOverloding(int a) {
		this ();
		System.out.println("I am parameterized constructor.");
	}
	public ConstructorOverloding(int a,int b) {
		this (a);
		System.out.println("I am two parameterized constructor.");
	}
	public ConstructorOverloding(int a,int b,int c) {
		this (a,b);
		System.out.println("I am three parameterized constructor.");
	}
	public ConstructorOverloding(int a,int b,int c,int d) {
		this (a,b,c);
		System.out.println("I am four parameterized constructor.");
	}
	public static void main(String[] args) {
		ConstructorOverloding c = new ConstructorOverloding(1,2,3,4);
	}
}