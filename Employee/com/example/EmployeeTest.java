package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Engineer eng1 = new Engineer(101, "Jane Smith", "012-34-5678", 100_345.27);
		Manager man1 = new Manager(207, "Barbara Johnson", "054-12-2367", 75_501.36, "US Marketing");
		Admin ad1 = new Admin(304, "Bill Munroe", "108-23-6509", 50_002.34);
		Director dir1 = new Director(12, "Susan Wheelern", "099-45-2340", 200_567.36, "Global Marketing", 1_000_000.00);
		Director dir2 = new Director(12, "Bobby Wheelern", "099-45-2340", 300_567.36, "Global Marketing", 1_000_000.00);
		
		
		Set<Employee> ss = new TreeSet<>(); // natural
		ss.add(eng1);
		ss.add(man1);
		ss.add(ad1);
		ss.add(dir1);
		ss.add(dir2);

		System.out.println(ss);
		
	}
	
	public static void printEmployee(Employee emp) {
		System.out.println(emp);
	}
	
	public static void printEmployee(Employee emp, EmployeeStockPlan esp) {
		System.out.println(emp);
		System.out.println("Stock Options:   " + esp.grantStock(emp));
	}

}
