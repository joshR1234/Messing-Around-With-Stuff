package com.example;

import java.text.NumberFormat;

public class Director extends Manager{

	private double budget;
	
	public Director(int id, String name, String ssn, double salary, String deptName, double budget) {
		super(id, name, ssn, salary, deptName);
		this.budget = budget;
	}
	
	//getters
	public double getBudget() {
		return budget;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nBudget: " + NumberFormat.getCurrencyInstance().format(budget);
	}

}
