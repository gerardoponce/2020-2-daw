<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="bean.Employee" %>
<%@include file="plantilla/header.jsp" %>
<html>
	<jsp:useBean id="empleado" class="bean.Employee" scope="request"/>
	<jsp:setProperty property="*" name="empleado"/>
	<div class="card">
		<h5 class="card-header">Ejemplo con Objeto</h5>
		<div class="card-body">
		  	 	<c:choose>
					<c:when test="${empleado != null}">
					    <p class="card-text">${empleado.id} - ${empleado.name}</p>
					    <p class="card-text">${empleado.role} - ${empleado.age}</p>
					</c:when> 
					<c:otherwise>
						<p>Id incorrecto</p>
					</c:otherwise>
				</c:choose>
			<a href="empleados" class="btn btn-primary">Listar empleados</a>
		</div>
	</div>

<%@include file="plantilla/footer.jsp" %>
