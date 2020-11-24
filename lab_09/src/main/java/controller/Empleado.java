package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Employee;

/**
 * Servlet implementation class Empleado
 */
@WebServlet("/empleado")
public class Empleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Empleado() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pag="empleado.jsp";
		int id = Integer.parseInt(request.getParameter("id"));
		Employee empleadoAux = null;
		Employee empleado = null;
		
		empleadoAux = Employee.getEmployees().get(id);
		
		if(empleadoAux != null) {
			empleado = new Employee(empleadoAux.getId(), empleadoAux.getName(), empleadoAux.getRole(), empleadoAux.getAge());
		}
		
		request.setAttribute("empleado", empleado);
		
		RequestDispatcher rd = request.getRequestDispatcher(pag);
		rd.forward(request, response);
	}

}
