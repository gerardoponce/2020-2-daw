package modelo;

import java.util.ArrayList;
import java.util.List;

import dao.ProductoEntity;
import dao.ProductoServicios;

public class ProductoBean {
	private String codigo;
	private String nombre;
	private double precio;
	private int stock;
	
	public ProductoBean(String codigo, String nombre, double precio, int stock) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public static ProductoBean getProducto(String codigo) {
		ProductoBean pb = null;
		ProductoEntity aux = new ProductoEntity();
		ProductoEntity prod;
		aux.setCodigo(codigo);
		
		ProductoServicios servicios = new ProductoServicios();
		prod = servicios.consultaProducto(aux);
		
		if(prod!=null) {
			pb = new ProductoBean(prod.getCodigo(), prod.getNombre(), prod.getPrecio(), prod.getStock());
		}
		else {
			pb = new ProductoBean("", "", 0.0, 0);
		}
		
		return pb;
	}
	
	public static List<ProductoBean> getProductos() {
		List<ProductoBean> listaProductos = new ArrayList<ProductoBean>();
		List<ProductoEntity> listaProductosEntity;
		
		ProductoBean pb = null;
		ProductoEntity prod = null;
		
		ProductoServicios servicios = new ProductoServicios();
		listaProductosEntity = servicios.consultarProductos();
		
		for(int i=0; i < listaProductosEntity.size(); i++){
			prod = listaProductosEntity.get(i);
		  
			if(prod!=null) {
				pb = new ProductoBean(prod.getCodigo(), prod.getNombre(), prod.getPrecio(), prod.getStock());
			}
			listaProductos.add(pb);  
		}
		
		return listaProductos;
	}
	
}
