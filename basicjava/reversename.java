package co.in.basicjava;

public class reversename {
	public static void main(String[] args) {
		
         StringBuffer name=new StringBuffer (" Gautam ");
         name.append("Gandhwani ");

		
		for (int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
			  
		}

		System.out.println(name);
	}
}