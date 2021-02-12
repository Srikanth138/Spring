<%@ page isELIgnored="false" import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<b>model data is :: ${name } , ${age } </b>
<hr>
<br>
model data(collections) is :: ${fruitsList}
<br>
${phonesSet}
<br>
${subjectMarksMap}
<br>
${favColors[0]} .. ${favColors[1]} .. ${favColors[2]}
<br>
<%=Arrays.toString((String[]) request.getAttribute("favColors"))%>
<br>
<%
for (String color : (String[]) request.getAttribute("favColors"))
	out.print(color + "...");
%>

<!-- Avoid the java code in jsp we can use the jstl here -->
<br>
<c:forEach var="color" items="${favColors}">
             ${color} ...
    </c:forEach>
<hr>
<br>
model data (DTO obj) :: ${empData}
<br>
${empData.ename} , ${empData.salary}
<br>
<b>Model data (listDTO) ::</b>
${empList}
<br>
<br>
<c:forEach var="emp" items="${empList}">
              ${emp} <br>
</c:forEach>

