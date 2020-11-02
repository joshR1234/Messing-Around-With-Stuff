package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	String name;
	
	Employee(String n){
		name = n;
	}
	
	public String getName() {
		return this.name;
	}
}
