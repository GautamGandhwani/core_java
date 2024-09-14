package co.in.variableandoperator;

public class StringToOtherDataType {
	public static void main(String[] args) {
		
		String str1="5";
		int i=Integer.parseInt(str1);
		System.out.println(i);
		
		String str2="5.5";
		double d=Double.parseDouble(str2);
		System.out.println(d);
		
		String str3="5.3";
		float f=Float.parseFloat(str3);
		System.out.println(f);
		
		String str4="5";
		long l=Long.parseLong(str4);
		System.out.println(l);
		
		String str5="True";
		boolean b=Boolean.parseBoolean(str5);
		System.out.println(b);
	}
}
