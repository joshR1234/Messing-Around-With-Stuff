package com.example;
import java.text.NumberFormat;
import java.util.Comparator;

public class Employee implements Comparator<Employee>{

	private int empId;
	private String name;
	private final String ssn;
	private double salary;

	public Employee(int id, String name, String ssn, double salary) {
		this.empId = id;
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
	}

	//setters
	protected void setName(String newname) {
		if (newname != null && newname != "") {
			name = newname;
		}
	}
	
	//getters

	public int getId() {
		return empId;
	}
	
	public String getSsn() {
		return ssn;
	}

	public String getName() {
		return name;
	}

	
	public double getSalary() {
		return salary;
	}

	
	//utility
	public void raiseSalary(double increase) {
		if(increase <= 0) {
			System.out.println("can't raise salary by 0 or less");
		}
		this.salary += increase;
	}
	
	public void printEmployee() {
		EmployeeStockPlan esp = new EmployeeStockPlan();
		
		System.out.println(
				"Employee type: " + this.getClass().getName()
				+ "Id: " + empId + "\nName: " + name + "\nSSN: " + ssn 
				+ "\nSalary: " + NumberFormat.getCurrencyInstance().format(salary) 
				+ "\nStock Options:   " + esp.grantStock(this)  );
	}
	
	@Override
	public String toString() {
		return "Id: " + empId + "\nName: " + name + "\nSSN: " + ssn 
				+ "\nSalary: " + NumberFormat.getCurrencyInstance().format(salary);
	}


	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.salary > o2.salary)
			return -1;
		else if (o1.salary < o2.salary)
			return 1;
		else
			return 0;
	}


}
