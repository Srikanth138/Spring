<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.nt.dto.EmployeeDTO, java.util.*, com.nt.entity.*"%>



<%
out.println(request.getAttribute("select"));

// EmployeeDTO al = (EmployeeDTO) request.getAttribute("select");
/* Employee al = (Employee) request.getAttribute("select");
out.println(al.getEno() + " , " + al.getEadd() + " , " + al.getEname() + " , "
		+ al.getESalary());
out.println(al.getEno() + " , " + al.getEadd() + " , " + al.getEname() + " , "
		+ al.getESalary());
 */
/* Optional<EmployeeDTO> al = (Optional<EmployeeDTO>) request.getAttribute("select");
for(EmployeeDTO e: al){
	out.println(e.getEno()+" , "+e.getEadd()+" , "+e.getEname()+" , "+e.getESalary());
}  */
%>

<br>
<a href="home">home</a>