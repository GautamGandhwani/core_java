package co.in.abstracte;

public class Child extends Parent {

	@Override
	public void Loan() {
		System.out.println("Complit Loan");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.Loan();
	}
}
