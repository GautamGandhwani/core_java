package co.in.oop;

public class TestAccount {
	
	public static void main(String[] args) {
		Account a = new Account();
		
		a.setNumber("6484234");
		a.setAccountType("Saving");
		a.setBalace(200000);
		a.diposit(2000);
		a.withdrow(200);
		a.fundtransfer(2000);
		a.paybill(5000);
		
		System.out.println("Account Number = "+a.getNumber());
		System.out.println("Account Type = "+a.getAccountType());
		System.out.println("Account Balanece = "+a.getBalace());
		
		
	}
}
