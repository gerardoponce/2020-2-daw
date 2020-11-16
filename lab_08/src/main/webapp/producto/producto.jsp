<%@page language="java" contentType="text/html" %>
<%@include file="../plantilla/header.jsp" %>
<jsp:useBean id="producto" type="modelo.ProductoBean" scope="request"/>
<jsp:setProperty property="*" name="producto"/>

<div class="card text-center">
  <div class="card-header">
    Producto
  </div>
  <div class="card-body">
 <%if(producto.getNombre() == "" && producto.getPrecio() == 0.0 && producto.getStock() == 0)  { %>
	  <p>Producto no encontrado</p>
 <%}
 else {
 %>
    
	  <div class="form-group">
	    <label for="nombre">Nombre</label>
	    <input type="text" class="form-control" id="nombre" name="nombre" value="<%=producto.getNombre() %>" disabled>
	  </div>
	  <div class="form-group">
	    <label for="precio">Precio</label>
	    <input type="text" class="form-control" id="precio" name="precio" value="<%=producto.getPrecio() %>" disabled>
	  </div>
	  <div class="form-group">
		<label class="stock" for="stock">Stock</label>
	    <input type="text" class="form-control" id="stock" name="stock" value="<%=producto.getStock() %>" disabled>
	  </div>
 <%} %>  
	
  </div>
  <div class="card-footer">
    <a class="btn btn-primary" href="producto/busqueda.jsp">Consultar otro producto</a>
  <%
  	if(producto.getNombre() != "" && producto.getPrecio() != 0.0 && producto.getStock() != 0) {
  %>
  	<a class="btn btn-info" href="Edicion?codigo=<%=producto.getCodigo() %>">Editar producto</a>
  <%
  	}
  %>
    
    <a class="btn btn-secondary" href="BusquedaProductos">Lista de productos</a>
  </div>
</div>

<%@include file="../plantilla/footer.jsp" %>