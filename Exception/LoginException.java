package co.in.Exception;

public class LoginException extends Exception{
	public LoginException() {
		System.out.println("Invalid login id.");
	}
}
