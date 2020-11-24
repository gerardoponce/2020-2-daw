<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="bean.Employee" %>
<%@include file="plantilla/header.jsp" %>

<div class="container">
	<h1 class="h3 text-center">Ejemplo con Map</h1>
	<jsp:useBean id="empleados" type="java.util.List<Employee>" scope="request"/>
	<jsp:setProperty property="*" name="empleados"/>
	<table class="table table-sm text-center">
	  <thead>
	    <tr>
	      <th scope="col">ID</th>
	      <th scope="col">NOMBRE</th>
	      <th scope="col">OPCIONES</th>
	    </tr>
	  </thead>
	  <tbody>
	  	<c:choose>
		<c:when test="${empleados != null}">
			<c:forEach items="${empleados}" var="empleado">
			<tr>
		      <th scope="row">${empleado.id}</th>
		      <td>${empleado.name}</td>
		      <td>
				<a href="empleado?id=${empleado.id}" class="btn btn-sm btn-success">Ver empleado</a>
			  </td>
		    </tr>
			</c:forEach>
		</c:when> 
		<c:otherwise>
			<p>No hay ningún empleado</p>
		</c:otherwise>
	</c:choose>
	    
	  </tbody>
	</table>

</div>

<%@include file="plantilla/footer.jsp" %>
