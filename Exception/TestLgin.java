package co.in.Exception;

public class TestLgin {
	public static void main(String[] args) throws LoginException  {
		String login ="xyz";
		
		if (login != "xyz") {
			throw new LoginException(); 
		} else {
			System.out.println("Usre login Successfully..");
		} 
	}
}
