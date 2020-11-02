package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class TestJdbc {
	
	public static void main(String[] args) {
		String jdbcUrl="jdbc:mysql://localhost:3306/world?useSSL=false";
		String usr = "root";
		String pswd = "root";
		
		try {
			System.out.println("Connecting to db" + jdbcUrl);
			Connection myConn = 
					DriverManager.getConnection(jdbcUrl, usr, pswd);
			System.out.println("ConnectionSuccessful");
			
		}catch (Exception exc){
			exc.printStackTrace();
		}
	}

}
