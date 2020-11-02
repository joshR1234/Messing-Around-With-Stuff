package com.example.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.example.model.Employee;
import com.example.model.EmployeeEJB;

@WebService
@Stateless
public class EmployeeWS {
	@Inject
	EmployeeEJB ejb;

	public String helloWorld(@WebParam String name) {
		return "Hello ," + name;
	}

	@WebMethod(operationName = "search")
	public Employee findbyId(@WebParam(name = "id") int id) {
		Employee emp = ejb.find(id);
		return emp;

	}
}
