package co.in.oop;

import java.util.Scanner;

public class TestAutoMobile {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	 AutoMoblile a = new AutoMoblile();
    	 
    	 a.setColor("c");
    	 a.setMake("Honda");
    	 a.setSpeed(0);
    	 System.out.println("Enter your gear = ");
    	 int g = sc.nextInt();
    	 a.changegear(g);
    	 
    	 System.out.println("Car color = "+a.getColor());
    	 System.out.println("Car maker = "+a.getMake());
    	 System.out.println("Car speed = "+a.getSpeed());    	 
	}
}