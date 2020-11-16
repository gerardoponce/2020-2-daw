<%@page language="java" contentType="text/html" %>
<%@page import="modelo.ProductoBean" %>
<%@include file="../plantilla/header.jsp" %>
<jsp:useBean id="productos" type="java.util.List<ProductoBean>" scope="request"/>
<jsp:setProperty property="*" name="productos"/>
<% 
ProductoBean producto;
%>

<h1 class="text-center">Lista de productos</h1>
<section>
	<a href="producto/registro.jsp" class="btn btn-primary">Nuevo producto</a>
</section>
<table class="table">
  <thead class="thead-light">
    <tr>
      <th scope="col">Código</th>
      <th scope="col">Nombre</th>
      <th scope="col">Precio</th>
      <th scope="col">Stock</th>
      <th scope="col" colspan="2">Opciones</th>
    </tr>
  </thead>
  <tbody>
 <%
if (productos.isEmpty()) {
%>
	<tr>
		<td colspan="6">No hay productos</td>
	</tr>
<% 
}
else {
	for(int i=0; i < productos.size(); i++){
		producto = productos.get(i);
	%>
		  <tr>
		    <th scope="row"><%=producto.getCodigo() %></th>
		    <td><%=producto.getNombre() %></td>
		    <td><%=producto.getPrecio() %></td>
		    <td><%=producto.getStock() %></td>
		    <td>
		    	<a class="btn btn-sm btn-success" href="Busqueda?codigo=<%=producto.getCodigo() %>">Ver más</a>
		    	<form action="Eliminacion" method="post">
		    		<input type="hidden" name="codigo" value="<%=producto.getCodigo() %>">
		    		<button class="btn btn-sm btn-danger" type="submit">Eliminar</button>
		    	</form>
		    </td>
		  </tr>
	<%		  
	}
}
%> 
  </tbody>
</table>

<%@include file="../plantilla/footer.jsp" %>