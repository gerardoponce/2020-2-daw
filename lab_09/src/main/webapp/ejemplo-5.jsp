<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
 <h3>Ejemplo 5</h3>
 <h3>Javabean Example</h3>
 <jsp:useBean id="empleado" class="bean.Employee" />
 
 <jsp:setProperty name="empleado" property="id" value="122" />
 <jsp:setProperty name="empleado" property="name" value="Ursula" />

 Employee Information :<br/><br/>
 <b>ID:</b> <c:out value="${empleado.id}" /><br/>
 <b>Name:</b> <c:out value="${empleado.name}" /><br/>

</body>
</html>
