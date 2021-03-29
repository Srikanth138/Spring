<%@page isELIgnored="false"%>
<h1 style="color: red; text-align: center;">this is the second page</h1>

<h3 style="color: green; text-align: center;">
	<%=request.getAttribute("sri")%><br> ${sri}<br> ${101}
</h3>

<a href="first">home</a>