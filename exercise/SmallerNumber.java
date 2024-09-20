package co.in.exercise;

import java.util.Scanner;

public class SmallerNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your a number :- ");
		int a=sc.nextInt();
		System.out.print("Enter your b number :- ");
		int b=sc.nextInt();
//		if (a<b) {
//			System.out.println("a is smaller number.");
//		} else {
//			System.out.println("b is smaller number.");
//		}
		int c = (a<b)?a:b;
		System.out.println("Smaller is :- "+c);
	}

}
