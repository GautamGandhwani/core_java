package co.in.oop;

public class TestEmploy {
	private int id;
	
	private String name;
	
	private double salary;
	
	private String post;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		
		TestEmploy e = new TestEmploy();
		
		e.setId(123);
		e.setName("Mohit");
		e.setSalary(50000);
		e.setPost("HR");
		
		System.out.println("ID = "+e.getId());
		System.out.println("Name = "+e.getName());
		System.out.println("Salary = "+e.getSalary());
		System.out.println("Post = "+e.getPost());
	}	
}