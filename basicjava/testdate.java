package co.in.basicjava;

	import java.time.LocalDateTime;
import java.time.LocalTime;
public class testdate {
	public static void main(String[] args) {
		
	
	
   LocalDateTime now =LocalDateTime.now();
   System.out.println("YEAR="+now.getYear());
   System.out.println("MONTH="+now.getMonthValue());
   System.out.println("DAY="+now.getDayOfWeek());
   System.out.println("TIME="+now.getHour());
   System.out.println("MINUTU="+now.getMinute());
   System.out.println("SECOND="+now.getSecond());
}
}