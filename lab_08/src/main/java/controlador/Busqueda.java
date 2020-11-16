package controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.ProductoBean;

/**
 * Servlet implementation class Busqueda
 */
public class Busqueda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Busqueda() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String codigo = request.getParameter("codigo");
		String pag="producto/producto.jsp";
		
		ProductoBean producto = ProductoBean.getProducto(codigo);
		request.setAttribute("producto", producto);
		RequestDispatcher rd = request.getRequestDispatcher(pag);
		rd.forward(request, response);
	}

}
