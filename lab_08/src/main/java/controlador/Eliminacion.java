package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductoServicios;
import modelo.ProductoBean;

/**
 * Servlet implementation class Eliminacion
 */
public class Eliminacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Eliminacion() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String codigo = request.getParameter("codigo");
		String nombre = "";
		double precio = 0.0;
		int stock = 0;
		
		ProductoBean producto = new ProductoBean(codigo, nombre, precio, stock);
		
		ProductoServicios servicios = new ProductoServicios();
		servicios.eliminarProducto(producto);
		response.sendRedirect("BusquedaProductos");
	}

}
