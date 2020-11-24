<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
 <h3>Ejemplo 1</h3>
 <c:set var="msg" value="Re Julien & Maurice" />
 
 <br>
 <c:out escapeXml="true" value="${msg}" />
 
 <br>
 <c:out escapeXml="false" value="${msg}" />

</body>
</html>
