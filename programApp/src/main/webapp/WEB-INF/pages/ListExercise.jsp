<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="list.Title" /></title>
</head>
<body>

<h3> Prueba de la lista de ejercicios</h3>
<c:if test="${not empty exercises }">
	<ul>
		<c:forEach var="listValue" items ="${exercises}">
			<li><spring:message code="exercises.Id"/> <c:out value="${listValue.idExercise}" /></li>
			<li><spring:message code="exercises.Text"/><c:out value="${listValue.text}" /></li>
			<li><spring:message code="exercises.ConsoleResult"/><c:out value="${listValue.consoleResult}" /></li>
			<li><spring:message code="exercises.Code"/><c:out value="${listValue.code}" /></li>
		</c:forEach>
	</ul>
</c:if>


</body>
</html>