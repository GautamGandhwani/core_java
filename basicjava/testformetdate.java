package co.in.basicjava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testformetdate {
	public static void main(String[] args)throws ParseException{
		
		Date d = new Date(); 
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String str =format.format(d);
		System.out.println(str);
		
		String str1 ="02/03/2007";
		Date d1 = format.parse(str1);
		System.out.println(d1);
		
	}
}