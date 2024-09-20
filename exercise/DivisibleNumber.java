package co.in.exercise;

public class DivisibleNumber {
	public static void main(String[] args) {
		int sum=0;
		for (int i = 100; i <=200; i++) {
			if (i%7==0) {
			 sum=sum+i;
			 System.out.println("Divisible by 7 :- "+i+"\t");
			}
		}
		System.out.println("\n"+"Sum of all number of divisible by 7 :- "+sum);
		
	}
}
