package co.in.basicjava;

public class teseconnection {

	public static void main(String[] args) {
		//methodcalling.sum();
		methodcalling m = new methodcalling();
		m.sum();
		m.sub();
		//System.out.println(m.multiply());
		m.multiply();
		System.out.println("Divide="+(m.divide(25, 5)));
	}
}
