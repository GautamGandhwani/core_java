package co.in.oop;

public class AutomobileConstructor {
	
	private int speed;
	private String color;
	private String make;
	
	public int getSpeed() {
		return speed;
	}
	public String getColor() {
		return color;
	}
	public String getMake() {
		return make;
	}
	
	public AutomobileConstructor() {
		System.out.println("I am defaolt Constructor");
	}
	public AutomobileConstructor(int speed, String color, String make) {
		this.color = color;
		this.make = make;
		this.speed = speed;
	}
	 public void changegear(int gear) {
  	   if (gear<=5) {
			int speed = gear*20;
			System.out.println("Cars gear = "+gear);
		} else {
          System.out.println("Invalid gear");
		}
     }
}