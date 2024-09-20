package co.in.exercise;

public class ReverseNumber {
	public static void main(String[] args) {
		int n = 123456789;
		int r = 0;
		int i = 0;
		while (i<=n) {
			r = n%10;
			n = n/10;
			System.out.print(r+"\t");
			i++;
		}
//		StringBuffer sb = new StringBuffer("1,2,3,4,5,6,7,8,9,0");
//		String s = String.valueOf("");
//		for (int i = 10; i > 0; i--) {
//			System.out.print(i+"\t");
//		}

//		System.out.println("Reverse="+sb.reverse());
	}
}
