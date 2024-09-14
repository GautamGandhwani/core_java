package co.in.basicjava;

public class methodcalling {
	
	public static void sum() {
		
		int a=50;
		int b=20;
		System.out.println("addition="+(a+b));
	}
	public void sub() {
		
		int a=80;
		int b=30;
		System.out.println("subtrectoin="+(a-b));
	}
	public int multiply() {
		
		int a=10;
		int b=2;
		int c=a*b;
		System.out.println("multiply="+c);
		return c;
	}
	public int divide(int a,int b) {
		return a/b;
		
	}
//	public static void main(String[] args) {
//		//methodcalling.sum();
//		methodcalling m = new methodcalling();
//		m.sum();
//		m.sub();
//		//System.out.println(m.multiply());
//		m.multiply();
//		System.out.println("Divide="+(m.divide(25, 5)));
//	}
}
