<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!-- JSTL and EL both are used here  -->
<h1 style="color: red; text-align: center">Result page</h1>

<h2 style="color: red; text-align: center">
	system date and time :: ${requestScope.sysDate } ,
	<%=request.getAttribute("sysDate")%>
</h2>
<br>
<h2 style="color: red; text-align: center">
	WishMessage :: ${requestScope.wMsg} ,
	<%=request.getAttribute("wMsg")%>
</h2>
<br>
<a href="welcome.htm">home</a>
