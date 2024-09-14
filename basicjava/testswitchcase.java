package co.in.basicjava;

public class testswitchcase {
	
     public static void main(String[] args) {
		
    	int number=1;
    	
    	String day;
    	
    	switch(number) {
    	
    	case 1:
    		day="Sunday";
    		break;
    		
    	case 2:
    		day="Monday";
    		break;
    		
    	case 3:
    		day="Tuesday";
    		break;
    		
    	case 4:
    		day="Wedneday";
    		break;
    	case 5:
    		day="Thrusday";
    		break;
    	case 6:
    		day="Friday";
    		break;
    	case 7:
    		day="Saturday";
    		break;
    		default:
    			day="invelid";
    			break;
    	}   	
    	System.out.println(day);
	}

}
