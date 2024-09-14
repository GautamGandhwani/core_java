package co.in.oop;

public class TestAccountConstructor {
	public static void main(String[] args) {
		AccountConstructor a = new AccountConstructor("2001","Saving",200000);
		System.out.println("Account Number :- "+a.getNumber());
		System.out.println("Account Type :- "+a.getAccounttype());
		System.out.println("Account Balance :- "+a.getBalance());
		
		a.diposit(50000);
		a.withdrow(50000);
		a.fundtransfer(80000);
		a.paybill(900000);
	 }        
}
