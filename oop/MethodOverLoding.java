package co.in.oop;

public class MethodOverLoding {
	public void sum() {
		System.out.println("Hello World");
	}
	public void sum(int a) {
		System.out.println("I have parameterized.");
	}
	public void sum(int a,int b) {
		System.out.println("I have two parameterized.");
	}
	public void sum(int a,int b,int c) {
		System.out.println("I have three parameterized."); 
	}
	public static void main(String[] args) {
		MethodOverLoding m = new MethodOverLoding();
		m.sum();
		m.sum(1);
		m.sum(1,2);
		m.sum(1,2,3);
	}
}