<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
 <h3>Ejemplo 2</h3>
	<c:set var="a" value="${33+42}" />
	<c:set var="b" value="${33*42}" />

	a : <c:out value="${a}" /> 
	<br>
	b : <c:out value="${b}" />
	<br>
	
	<c:if test="${a>b}">
 		El valor de a es mayor que b
 	</c:if>
	<c:if test="${a==b}">
 		El valor de a es igual a b
 	</c:if>
	<c:if test="${a<b}">
 		El valor de a es menor que b
 	</c:if>
</body>
</html>
