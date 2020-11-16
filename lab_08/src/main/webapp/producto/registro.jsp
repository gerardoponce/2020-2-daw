<%@page language="java" contentType="text/html" %>
<%@include file="../plantilla/header.jsp" %>

<div class="card text-center">
<form action="../Registro" method="post">
  <div class="card-header">
    Registro de un nuevo producto
  </div>
  <div class="card-body">
    
	  <div class="form-group">
	    <label for="nombre">Nombre</label>
	    <input type="text" class="form-control" id="nombre" name="nombre">
	  </div>
	  <div class="form-group">
	    <label for="precio">Precio</label>
	    <input type="text" class="form-control" id="precio" name="precio">
	  </div>
	  <div class="form-group">
		<label class="stock" for="stock">Stock</label>
	    <input type="text" class="form-control" id="stock" name="stock">
	  </div>
	  
	
  </div>
  <div class="card-footer">
    <button type="submit" class="btn btn-success">Registrar</button>
    <a class="btn btn-secondary" href="../BusquedaProductos">Lista de productos</a>
  </div>
</form>
</div>

<%@include file="../plantilla/footer.jsp" %>