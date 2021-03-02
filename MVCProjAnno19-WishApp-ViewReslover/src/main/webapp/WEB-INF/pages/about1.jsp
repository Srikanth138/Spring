<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<h1 style="color:red;text-align:center">About page  </h1>

<h2 style="color:red;text-align:center">  about Details ::  ${requestScope.names } , <%=request.getAttribute("names") %>  </h2>
<h2 style="color:red;text-align:center">  about Details ::  ${requestScope.a } , <%=request.getAttribute("a") %>  </h2>
<br>
<a href="welcome">home</a>