package co.in.basicjava;

public class testcargear {
	
	public static void main(String[] args) {
		
		int gear=6;
		
		String speed;
		
		switch(gear) {
		
		case 1:
    		speed="20";
    		break;
    		
		case 2:
    		speed="40";
    		break;
    		
		case 3:
    		speed="60";
    		break;
    		
		case 4:
    		speed="80";
    		break;
    		
		case 5:
    		speed="100";
    		break;
    		
		default:
    		speed="invelid speed";
    		break;
		}
		System.out.println(speed);
	}

}
