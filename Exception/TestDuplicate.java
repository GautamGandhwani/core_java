package co.in.Exception;

public class TestDuplicate {
	public static void main(String[] args) throws DuplicateException {
		String id="Gautam123";
		
		if (id == "Gautam12") {
			throw new DuplicateException();
		} else {
			System.out.println("Usre login Successfully..");
		}
	}
}
