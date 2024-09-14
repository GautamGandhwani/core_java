package co.in.oop;

import java.time.LocalDate;

public class TestPerson {
	
	public static void main(String[] args) {
		LocalDate dob = LocalDate.of(2003,03,02);
		Person p = new Person();
		p.setName("Gautam");
		p.setMobileno(4542);
		p.setAddress("Barwani");
		p.setCity("Indore");
		p.setSalary(100000);
    	p.setDob(dob);
		
		System.out.println("Name = "+p.getName());
		System.out.println("Address = "+p.getAdress());
		System.out.println("City = "+p.getCity());
		System.out.println("Salary = "+p.getSalary());
		System.out.println("Mobileno = "+p.getMobileno());
		System.out.println("Date of Birth = "+p.getDob());
		System.out.println("Age = "+p.getAge());
		
	}

}
