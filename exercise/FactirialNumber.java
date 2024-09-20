package co.in.exercise;

import java.util.Scanner;

public class FactirialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int n = sc.nextInt();
		int f = 1;
		
		for (int i = 1; i <=n; i++) {
			f=f*i;
		}
		System.out.println("\n"+"Factorial is :- "+f);
	}
}
