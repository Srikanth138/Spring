<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form modelAttribute="login">
	<!-- method is not requied because prerequed method is POST here modelAttribute -->
	<table bgcolor="cyan" align="center">
		<tr>
			<td>Enter Name ::</td>
			<td><input type="text" name="name"> <%-- 			<form:input path="name" /> --%></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="register" /></td>
		</tr>
	</table>

</form:form>
