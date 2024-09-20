package co.in.exercise;

import java.util.Scanner;

public class MaximumNumber {
 public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter your a number :- ");
	int a= sc.nextInt();
	System.out.print("Enter your b number :- ");
	int b= sc.nextInt();
//	if (a>b) {
//		System.out.println("a is maximum nubmer.");
//	} else {
//		System.out.println("b is maximum number.");
//	}
	System.out.println("maximum number a,b :- "+Math.max(a, b));
}
}
