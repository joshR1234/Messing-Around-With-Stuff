package employeemanagement.domain;

public class Employee {
	
	private String id;
	private String name;
	
	public Employee(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return "Employee:  " + name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
