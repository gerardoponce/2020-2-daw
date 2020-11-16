package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.ProductoBean;

/**
 * Servlet implementation class BusquedaProductos
 */
public class BusquedaProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BusquedaProductos() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pag="producto/productos.jsp";
		List<ProductoBean> productos = new ArrayList<ProductoBean>();
	
		productos = ProductoBean.getProductos();
		request.setAttribute("productos", productos);
		
		RequestDispatcher rd = request.getRequestDispatcher(pag);
		rd.forward(request, response);
	}

}
