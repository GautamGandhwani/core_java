package co.in.oop;

import java.time.LocalDate;
import java.time.Period;

public class Person {

	private String name;
	
	private long mobileno;
	
	private String address;
	
	private int salary;
	
	private String city;
	
	private LocalDate dob;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	
	public String getAdress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address= address;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary= salary;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city= city;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	public int getAge() {
		LocalDate currentDate = LocalDate.now();
		return Period.between(dob, currentDate).getYears();
	}
	
}