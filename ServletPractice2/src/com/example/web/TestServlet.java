package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.model.*;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet({ "/TestServlet", "/my" })
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
   
  
	/**
	 * }
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		double salary=Double.parseDouble(request.getParameter("salary"));
		int did=Integer.parseInt(request.getParameter("did"));
		String action=request.getParameter("action");
		
		EmployeeEJB ejb=new EmployeeEJB(); // a representation like EJB
		String resp="";
		switch(action.toLowerCase()) {
		case "insert":
			Employee e=new Employee(id,name,salary);
			resp=ejb.insert(e);
			request.setAttribute("result", resp);
			request.setAttribute("emp", e);
			request.getRequestDispatcher("result.jsp").forward(request, response);
			break;
		case "find":
			String s=ejb.find(id);
			System.out.println(s);
			String[] empDetail=s.split(":");// delimiters
			name=empDetail[1];
			salary=Double.parseDouble(empDetail[2]);
			Employee e1=new Employee(id,name,salary);
			request.setAttribute("emp", e1);
			request.getRequestDispatcher("index.jsp").forward(request, response);
			break;
			
		}
		
	  
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	
	}

}
