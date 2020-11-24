package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Employee;

/**
 * Servlet implementation class Empleados
 */
@WebServlet("/empleados")
public class Empleados extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Empleados() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pag="empleados.jsp";
		List<Employee> empleados = new ArrayList<Employee>();
	
		empleados = Employee.getEmployees();
		request.setAttribute("empleados", empleados);
		
		RequestDispatcher rd = request.getRequestDispatcher(pag);
		rd.forward(request, response);
	}

}
