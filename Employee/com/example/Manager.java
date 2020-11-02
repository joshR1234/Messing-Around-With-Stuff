package com.example;

import java.text.NumberFormat;

public class Manager extends Employee{

	private String deptName;
	
	public Manager(int id, String name, String ssn, double salary, String deptName) {
		super(id, name, ssn, salary);
		this.deptName = deptName;
		System.out.println("Manager created");
	}

	//getters
	public String getDeptName() {
		return deptName;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nDepartment Name: " + deptName;
	}

}
