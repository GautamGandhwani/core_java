package co.in.basicjava;

public class stringbuffer {
   	
     public static void main(String[] args) {
		
    	 StringBuffer sb=new StringBuffer("Gautam");
    	 sb.append("Gandhwani");
    	 
    	 System.out.println("length="+sb.length());
    	 System.out.println("Capacity="+sb.capacity());
    	 System.out.println("Char at="+sb.charAt(10));
    	 System.out.println("Idex Of="+sb.indexOf("Gandhwani"));
    	 System.out.println("Rplace="+sb.replace(1,7, ""));
    	// System.out.println("Reverce="+sb.reverse());
	}
}
