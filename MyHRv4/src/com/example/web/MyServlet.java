package com.example.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.model.Employee;
import com.example.model.EmployeeEJB;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet({ "/MyServlet", "/my" })
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	EmployeeEJB ejb;

	// @Inject
	Employee emp;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

  
	/**
	 * }
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		double salary=Double.parseDouble(request.getParameter("salary"));
		int did=Integer.parseInt(request.getParameter("did"));
		String action=request.getParameter("action");
		

		String resp="";
		switch(action.toLowerCase()) {
		case "insert":
			 Employee emp=new Employee();
			emp.setId(id);
			emp.setName(name);
			emp.setSalary(salary);
			resp = ejb.insert(emp);
			request.setAttribute("result", resp);
			request.setAttribute("emp", emp);
			request.getRequestDispatcher("/admin/result.jsp").forward(request, response);
			break;
		case "find":
			emp = ejb.find(id);

			// Employee e1=new Employee(id,name,salary);
			HttpSession session = request.getSession();
			session.setAttribute("emp", emp);

			request.getRequestDispatcher("/admin/index.jsp").forward(request, response);
			break;
			
		}
		
	  
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	
	}

}
