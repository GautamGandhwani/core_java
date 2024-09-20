package co.in.exercise;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a= 0,b=1,c=20;
		
		for (int i = 0; i <=c; i++) {
			System.out.print(a+",");
			int d = b+a;
			a=b;
			b=d;
		}
	}

}
