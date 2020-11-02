package com.example.entities;

import java.sql.Connection;
import java.util.List;

import com.mysql.cj.Query;
import com.mysql.cj.xdevapi.*;

public class TestEmployee {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg=cfg.configure("com/example/cfg/hibernate.cfg.xml");
		SessionFactory f=cfg.buildSessionFactory();
		Session s=f.openSession();
		Employee e = s.get(Employee.class, 7);
		System.out.println(e.toString());
	    Employee e=new Employee(3, "Nitin", 1300.00);
	    Employee e2=new Employee(2, "Ferry", 2200.00);
		Employee e=s.get(Employee.class, 3);
		if(e!=null) {
			e.setName("Hayden");
		 Transaction tx=s.getTransaction();
			    try {
			    	tx.begin();
			    		
				    	
				   
			    	tx.commit();
			    	System.out.println("Object updated");
			    }catch(Exception ex) {
			    	tx.rollback();
			    	System.out.println(ex.toString());
			    }
		}else {
			
			System.out.println("Record doesnt exist");
			
		}
	   
		Employee ee=s.get(Employee.class, 2);
		tx.begin();
		Query q=s.createQuery("update Employee e set e.salary=:sal where e.id=:eid");
		q.setParameter("eid",2);
		q.setParameter("sal",1400.00);
		q.executeUpdate();
		tx.commit();
		
		Query<Employee> q1=s.createQuery("from Employee e where e.id=:eid ", Employee.class);
		q1.setParameter("eid",2);
		List<Employee> ll=q1.list();
	    ll.forEach(e->System.out.println(e));
		Criteria cr = s.createCriteria(Employee.class);
		List results = cr.list();
		System.out.println(results);
	    s.close();
	    f.close();
	}

}
