package co.in.basicjava;

public class method {
   
	public static void main(String[] args) {
		
		String name=("Gautam Gandhwani");
		System.out.println("Length of Name="+name.length());
		System.out.println("8th character="+name.charAt(7));
		System.out.println("Gan index is="+name.indexOf("Gan"));
		System.out.println("first a position="+name.indexOf("a"));
		System.out.println("last a position="+name.lastIndexOf("a"));
		System.out.println("a is replaced by b="+name.replace("a","b"));
		System.out.println("chhota gautam="+name.toLowerCase());
		System.out.println("Bada gautam="+name.toUpperCase());
		System.out.println("Start with gautam="+name.startsWith("Gautam"));
		System.out.println("End with ani="+name.endsWith("ani"));
		System.out.println("substring="+name.substring(6));
	}
}
