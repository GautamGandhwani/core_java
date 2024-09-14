package co.in.oop;

import java.time.LocalDate;
import java.time.Period;


public class PersonConstuctor {
      private String name;
      private int salary;
      private String city;
      private LocalDate dob;
      
      public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public String getCity() {
		return city;
	}
	public LocalDate getDob() {
		return dob;
	}
	public PersonConstuctor() {
    	System.out.println("I am defaolt Constructor");  
      }  
	public PersonConstuctor(String name,int salary,String city,LocalDate dob) {
    	  this.name = name;
    	  this.salary = salary;
    	  this.city = city;
    	  this.dob = dob;
      }
	public  int getAge() {
	   LocalDate currentDate = LocalDate.now();
		return Period.between(dob,currentDate ).getYears();
		     
		}
}