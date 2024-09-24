package co.in.Exception;

public class TestFund {
	public static void main(String[] args) throws FundException {
		int widrol = 50000;
		int accountbalance=50000;
		if (widrol >accountbalance) {
			throw new FundException();
		} else {
			System.out.println("Widrol successfully");
		}
	}
}
