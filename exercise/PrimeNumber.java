package co.in.exercise;

public class PrimeNumber{
	public static void main(String[] args) {
		int num = 14;
		int count = 0;
		
		if (num<=1) {
			System.out.println("Number is not prime.");
		}
		for (int i = 1; i <= num/2; i++) {
			if (num%i==0) {
				count++;
			}
			}
			if (count>1) {
				System.out.println("Number is not prime.");
			} else {
				System.out.println("Number is prime.");
			} 
		}
	}
