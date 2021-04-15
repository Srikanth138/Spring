<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body class="container">
	<h1 class="text-danger">Welcome our First Boot Application</h1>

	<table class="container bgcolor-danger">
		<tr>
			<td colspan="2"
				style="text-align: center; color: green; border-bottom: double; border-bottom-color: red;">
				<a href="count">NoOFEmployee Cont</a>
			</td>
		</tr>
	</table>
	<hr></hr>

	<form action="remove">
		<table class="container" style="background: cyan; text-align: center;">
			<tr>
				<td colspan="2"
					style="table-layout: inherit; text-align: center; background: green; text-shadow: maroon;">REMOVE
					THE DETAILS BASED ON THE ID</td>
			</tr>
			<tr>
				<td>Enter ID::</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td colspan="2"
					style="text-align: center; color: red; border-bottom: double; border-bottom-color: green;"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="submit"></td>
			</tr>
		</table>
	</form>
	<hr></hr>

	<form action="select">
		<table class="container" style="background: cyan; text-align: center;">
			<tr>
				<td colspan="2"
					style="table-layout: inherit; text-align: center; background: green; text-shadow: maroon;">FIND
					THE DETAILS BASED ON THE ID</td>
			</tr>
			<tr>
				<td>Enter ID::</td>
				<td><input type="text" name="eno"></td>
			</tr>
			<tr>
				<td colspan="2"
					style="text-align: center; color: red; border-bottom: double; border-bottom-color: green;"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="submit"></td>
			</tr>
		</table>
	</form>
	<hr></hr>

	<form action="result">
		<table class="container bgcolor-danger">
			<tr>
				<td>Enter name::</td>
				<td><input type="text" name="name"></td>
			<tr>
				<td>Enter address::</td>
				<td><input type="text" name="add"></td>
			<tr>
				<td>Enter salary::</td>
				<td><input type="text" name="salary"></td>
			<tr>
				<td>
			<tr>
				<td colspan="2"><input type="submit" value="submit"></td>
			</tr>
		</table>
	</form>


	<form action="update">
		<table class="container bgcolor-danger"
			style="background: cyan; text-align: center;">
			<tr>
				<td colspan="2"
					style="table-layout: inherit; text-align: center; background: green; text-shadow: maroon;">UPDATE
					THE DETAILS BASED ON THE ID</td>
			</tr>
			<tr>
				<td>Enter ID::</td>
				<td><input type="text" name="eno"></td>
			<tr>
			<tr>
				<td>Enter name::</td>
				<td><input type="text" name="ename"></td>
			<tr>
				<td>Enter address::</td>
				<td><input type="text" name="eadd"></td>
			<tr>
				<td>Enter salary::</td>
				<td><input type="text" name="eSalary"></td>
			<tr>
				<td>
			<tr>
				<td colspan="2"><input type="submit" value="update"></td>
			</tr>
		</table>
	</form>


</body>
</html>