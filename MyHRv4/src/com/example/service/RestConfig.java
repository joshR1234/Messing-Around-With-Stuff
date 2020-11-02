package com.example.service;

import java.util.Set;

import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.ext.Provider;

//activates restful services, without this you have to do some configurations to your xml file
//second option is confiugring web xml
//mime helps identify data type
@Provider 
@ApplicationPath("rest")
public class RestConfig extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		return super.getClasses();
	}
	
}
