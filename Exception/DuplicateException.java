package co.in.Exception;

public class DuplicateException extends Exception{
	public DuplicateException() {
		System.out.println("This id already exist..atry again");
	}
}
