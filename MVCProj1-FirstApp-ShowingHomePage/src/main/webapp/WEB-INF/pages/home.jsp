<%@ page isELIgnored="false"%>

<h1 style="color:red;text-align:center">Welcome to Spring MVC</h1>
 <br> <br> Date and time ::  ${sysDate}
 
 <% 
	response.setContentType("text/html");
	//response.setHeader("refresh", "3");//seconds take
	response.setIntHeader("refresh",3); //seconds take
	out.println("hello user..."); %>