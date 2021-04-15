<%@ page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<h1 style="Color:red;text-align:Center"> INSERTED Employee Page </h1>

<form:form  modelAttribute="empFrm">
 
</form:form>
<%out.println(request.getAttribute("dto")); %>


<br></br>

<a href="home">home</a>
    
