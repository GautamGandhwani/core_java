package co.in.exercise;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		Random rn = new Random();
		for (int i = 1; i <=5 ; i++) {
		int r = rn.nextInt(100);
		System.out.println("Random numbers is :- "+r);
	}
}
}