package co.in.oop;

public class TestAutomobileConstructor {
	public static void main(String[] args) {
		AutomobileConstructor m = new AutomobileConstructor(20,"Black","Honda");
			
		System.out.println(m.getSpeed());
		System.out.println(m.getColor());
		System.out.println(m.getMake());
		
		m.changegear(2);
		
	}

}
