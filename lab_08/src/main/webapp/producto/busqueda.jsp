<%@page language="java" contentType="text/html" %>
<%@include file="../plantilla/header.jsp" %>

<div class="card text-center">
<form action="../Busqueda" method="get">
  <div class="card-header">
    Búsqueda de un producto
  </div>
  <div class="card-body">
    
	  <div class="form-group">
	    <label for="codigo">Código</label>
	    <input type="text" class="form-control" id="codigo" name="codigo">
	  </div>
	
  </div>
  <div class="card-footer">
    <button type="submit" class="btn btn-success">Buscar</button>
    <a class="btn btn-secondary" href="../BusquedaProductos">Lista de productos</a>
  </div>
</form>
</div>

<%@include file="../plantilla/footer.jsp" %>