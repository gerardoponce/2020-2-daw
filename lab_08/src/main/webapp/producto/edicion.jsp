<%@page language="java" contentType="text/html" %>
<%@include file="../plantilla/header.jsp" %>
<jsp:useBean id="producto" type="modelo.ProductoBean" scope="request"/>
<jsp:setProperty property="*" name="producto"/>

<div class="card text-center">
<form action="Actualizacion" method="post">
  <div class="card-header">
    Actualización de un producto
  </div>
  <div class="card-body">
      <input type="hidden" name="codigo" value="<%=producto.getCodigo() %>">
	  <div class="form-group">
	    <label for="nombre">Nombre</label>
	    <input type="text" class="form-control" id="nombre" name="nombre" value="<%=producto.getNombre() %>">
	  </div>
	  <div class="form-group">
	    <label for="precio">Precio</label>
	    <input type="text" class="form-control" id="precio" name="precio" value="<%=producto.getPrecio() %>">
	  </div>
	  <div class="form-group">
		<label class="stock" for="stock">Stock</label>
	    <input type="text" class="form-control" id="stock" name="stock" value="<%=producto.getStock() %>">
	  </div>
	  
	
  </div>
  <div class="card-footer">
    <button type="submit" class="btn btn-success">Actualizar</button>
    <a class="btn btn-secondary" href="BusquedaProductos">Lista de productos</a>
  </div>
</form>
</div>

<%@include file="../plantilla/footer.jsp" %>