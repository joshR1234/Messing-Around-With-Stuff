package cogent.hr.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hr.app.dao.EmployeeDAO;

import cogent.hr.app.domain.Employee;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/test")
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("eid"));
		String name = request.getParameter("ename");
		double salary = Double.parseDouble(request.getParameter("esal"));
		int did = Integer.parseInt(request.getParameter("edid"));

		Employee emp = new Employee(id, name, salary, did);
		EmployeeDAO dao = new EmployeeDAO();

		if (dao.insert(emp)) {
			request.setAttribute("employee", emp);
		} else {
			String s = "Cant Register you, please contact administrator";
			request.setAttribute("message", s);
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);

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
