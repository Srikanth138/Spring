<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="com.nt.dto.*,com.nt.entity.*,java.util.*" pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1 style="Color: red; text-align: Center">Edit Employee Page</h1>

<%=request.getAttribute("select")%>
<br>
<a href="home">home</a>
<br>
<form:form action="update" modelAttribute="empFrm">
	<table align="center" bgcolor="cyan">
		<tr>
			<td>Employee no ::</td>
			<td><form:input path="eno" readonly="true" /></td>
		</tr>
		<tr>
			<td>Employee name ::</td>
			<td><form:input path="ename" /></td>
		</tr>
		<tr>
			<td>Employee Address ::</td>
			<td><form:input path="eadd" /></td>
		</tr>
		<tr>
			<td>Employee salary ::</td>
			<td><form:input path="eSalary" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit"
				value="Edit Employee"></td>
		</tr>
	</table>
</form:form>