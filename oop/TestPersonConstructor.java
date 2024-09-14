package co.in.oop;

import java.time.LocalDate;

public class TestPersonConstructor {
	 public static void main(String[] args) {
   	  PersonConstuctor p = new PersonConstuctor("Gautam",50000,"indore", LocalDate.of(2003,03,02));
   	  LocalDate dob = LocalDate.of(2003,03,02);
   	  System.out.println("Name :- "+p.getName());
   	  System.out.println("Salary :-"+p.getSalary());
   	  System.out.println("City :- "+p.getCity());
   	  System.out.println("Date Of Birth :- "+p.getDob());
   	  System.out.println("Current Age :- "+p.getAge());
	}

}
