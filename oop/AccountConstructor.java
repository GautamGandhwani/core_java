package co.in.oop;

public class AccountConstructor {
	private String number;
	private String accounttype;
	private double balance;
	
	public String getNumber() {
		return number;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public double getBalance() {
		return balance;
	}
	
	public AccountConstructor() {
		System.out.println("I am defaolt Constructor");
	}
	
	public AccountConstructor(String number, String accounttype, double balance) {
		this.number = number;
		this.accounttype = accounttype;
		this.balance = balance;
	}
	
	public void diposit(double amount) {
		if (amount>0) {
			 balance += amount;
			System.out.println("Deposit Successful. New balance :- "+balance);
		} else {
            System.out.println("Invalid deposit amount.");
		}
	}
	public void withdrow(double amount) {
		if (amount > 0 && amount <= balance) {
             balance -= amount;
			System.out.println("Withdrow successful. New balance :- "+balance);
		} else {
            System.out.println("Invalid withdrow amount or insufficint balance.");
            }  
		}
	public void fundtransfer(double amount) {
		if (amount > 0 && amount <= balance) {
             balance -= amount;
			System.out.println("Withdrow successful. New balance :- "+balance);
		} else {
            System.out.println("Invalid withdrow amount or insufficint balance.");
            }  
		}
	public void paybill(double amount) {
		if (amount > 0 && amount <= balance) {
             balance -= amount;
			System.out.println("Withdrow successful. New balance :- "+balance);
		} else {
            System.out.println("Invalid withdrow amount or insufficint balance.");
            }  
		}
	
}