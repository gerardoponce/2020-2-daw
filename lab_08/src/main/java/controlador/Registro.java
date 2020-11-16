package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductoServicios;
import modelo.ProductoBean;

/**
 * Servlet implementation class Registro
 */
public class Registro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registro() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String codigo = request.getParameter("codigo");
		String nombre = request.getParameter("nombre");
		double precio = Double.parseDouble(request.getParameter("precio"));
		int stock = Integer.parseInt(request.getParameter("stock"));
		
		ProductoBean producto = new ProductoBean(codigo, nombre, precio, stock);
		
		ProductoServicios servicios = new ProductoServicios();
		servicios.registrarProducto(producto);
		response.sendRedirect("BusquedaProductos");
	}

}
