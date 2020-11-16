package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.ProductoBean;

public class ProductoServicios {
	Connection con;
	String driver="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost/tecsup_daw?serverTimezone=UTC";
	String usuario="dev";
	String clave="#123456";
	
	public ProductoServicios() {
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,usuario,clave);
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}	
	}
	
	public ProductoEntity consultaProducto(ProductoEntity producto) {
		ProductoEntity prod = null;
		try {
			PreparedStatement ps = con.prepareStatement("select * from lab8_productos where codigo = ?");
			ps.setString(1, producto.getCodigo());
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				prod = new ProductoEntity();
				prod.setCodigo(rs.getString(1));
				prod.setNombre(rs.getString(2));
				prod.setPrecio(rs.getDouble(3));
				prod.setStock(rs.getInt(4));
			}
			
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return prod;
	}
	
	public void registrarProducto(ProductoBean producto) {
		try {
			PreparedStatement ps = con.prepareStatement("insert into lab8_productos values(?, ?, ?, ?)");
			
			ps.setString(1, producto.getCodigo());
			ps.setString(2, producto.getNombre());
			ps.setDouble(3, producto.getPrecio());
			ps.setInt(4, producto.getStock());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<ProductoEntity> consultarProductos() {
		List<ProductoEntity> listaProductos = new ArrayList<ProductoEntity>();
		ProductoEntity prod = null;
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from lab8_productos order by codigo");
			
			while(rs.next()) {
				prod = new ProductoEntity();
				prod.setCodigo(rs.getString(1));
				prod.setNombre(rs.getString(2));
				prod.setPrecio(rs.getDouble(3));
				prod.setStock(rs.getInt(4));
				
				listaProductos.add(prod);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaProductos;
	}
	
	public void eliminarProducto(ProductoBean producto) {
		try {
			PreparedStatement ps = con.prepareStatement("delete from lab8_productos where codigo = ?");
			
			ps.setString(1, producto.getCodigo());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void actualizarProducto(ProductoBean producto) {
		try {
			PreparedStatement ps = con.prepareStatement("update lab8_productos set nombre = ? , precio = ? , stock = ? where codigo = ?");
			
			ps.setString(4, producto.getCodigo());
			ps.setString(1, producto.getNombre());
			ps.setDouble(2, producto.getPrecio());
			ps.setInt(3, producto.getStock());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
