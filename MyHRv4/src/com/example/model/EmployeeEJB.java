package com.example.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.sql.DataSource;


/**
 * Session Bean implementation class EmployeeEJB
 */

@Stateless
public class EmployeeEJB {
	Connection con=null;
	PreparedStatement pstmt=null;
	@Resource(name="jdbc/emp-db")
	DataSource ds;

    public EmployeeEJB() {
    
	}

	@PostConstruct
	public void init() {

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
    
	public Employee find(int id) {
    	StringBuilder result=new StringBuilder();
		Employee emp = new Employee();
		try {
			PreparedStatement pstm = con.prepareStatement("select * from employees where emp_id=?");
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				emp.setId(rs.getInt("emp_id"));

				emp.setName(rs.getString("emp_name"));
				emp.setSalary(rs.getDouble("salary"));
			}

		} catch (Exception ex) {
			System.out.println(ex);
		}
		// result.append("2").append(":").append("Nitin").append(":").append(2000.00);
		return emp;
    }
}
