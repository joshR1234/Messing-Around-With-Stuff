package com.example.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;






/**
 * Session Bean implementation class EmployeeEJB
 */

public class EmployeeEJB {
	Connection con=null;
	PreparedStatement pstmt=null;
    
    public EmployeeEJB() {
    
    	DataSource ds=null;
		try {
			Context initContext = new InitialContext();
	    	Context envContext  = (Context)initContext.lookup("java:/comp/env");
			ds = (DataSource)envContext.lookup("jdbc/mydb");
			//System.out.println(ds);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    		
		String query = "insert into employees(emp_id, emp_name, salary) values(?,?,?)";
		try {
			con = ds.getConnection();
			// System.out.println(con);
			pstmt=con.prepareStatement(query);
		}catch(Exception ex) {
			System.out.println("Error2"+ex);
		}
    }
    
    public String insert(Employee e) {
    	try {
    		pstmt.setInt(1, e.getId());
    		pstmt.setString(2, e.getName());
    		pstmt.setDouble(3, e.getSalary());
    		pstmt.executeUpdate();
    	}catch(Exception ex) {
    		System.out.println(ex);
    	}
    	//insertion
    	return("registered");
    }
    
    public String find(int id) {
    	StringBuilder result=new StringBuilder();
    	try {
    		PreparedStatement pstm=con.prepareStatement("select * from employees where emp_id=?");
    		pstm.setInt(1, id);
			ResultSet rs=pstm.executeQuery();
			if(rs.next()) {
				result.append(rs.getString("emp_id")+":");
				result.append(rs.getString("emp_name")+":");
				result.append(rs.getString("salary"));
			}


    	}catch(Exception ex) {
    		System.out.println(ex);
    	}
    	//insertion
    	return result.toString();
    }
}
