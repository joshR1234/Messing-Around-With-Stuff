package com.example.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path; 
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/emp-rest")
public class EmployeeRS {
	@GET 
	@Path("/hello/{fname}/{lname}")
	@Produces("text/plain")
	//Path("/hello")
	//public String sayHello(@QueryParam("fname") String firstName, @QueryParam("lname") String lastName)
	//makes url something like... 8080/hrm/rest/emp-rest?fname=Nitin&lname=Sriva instead of /emp=rest/hello/Nitin/Sriva
	public String sayHello(@PathParam("fname") String firstName, @PathParam("lname") String lastName) {
		return "Hello, " + firstName + " " + lastName;
	}
}
