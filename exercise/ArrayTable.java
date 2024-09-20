package co.in.exercise;

public class ArrayTable {
	public static void main(String[] args) {
		int[][] a= new int[9][10];
		
//		a[1][10]=10;
//		int size = a.length;
	    int size = a[0].length;
	    
	    for (int i = 2; i <= size; i++) {
			for (int j = 1; j <=size; j++) {
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
	}

}
