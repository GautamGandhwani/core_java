package co.in.oop;

public class Account {
	
	private String number;
	
	private String accountType;
	
	private double balace;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalace() {
		return balace;
	}

	public void setBalace(double balace) {
		this.balace = balace;
	}
	
	public void diposit(double amount) {
		if (amount>0) {
			 balace += amount;
			System.out.println("Deposit Successful. New balance = "+balace);
		} else {
            System.out.println("Invalid deposit amount.");
		}
	}
	
	public void withdrow(double amount) {
		if (amount > 0 && amount <= balace) {
             balace -= amount;
			System.out.println("Withdrow successful. New balance = "+balace);
		} else {
            System.out.println("Invalid withdrow amount or insufficint balance.");
            }  
		}
	
		public void fundtransfer(double amount) {
			if (amount > 0 && amount <= balace) {
	             balace -= amount;
				System.out.println("Fundtransfer successful. New balance = "+balace);
			} else {
	            System.out.println("Invalid fundtransfer amount or insufficint balance.");            
			}
	}
		public void paybill(double amount) {
			if (amount > 0 && amount <= balace) {
	             balace -= amount;
				System.out.println("Paybill successful. New balance = "+balace);
			} else {
	            System.out.println("Invalid Paybill amount or insufficint balance.");        
			}
		}
}