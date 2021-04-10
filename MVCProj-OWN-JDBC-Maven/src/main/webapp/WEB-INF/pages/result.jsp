<%@page isELIgnored="false" import="com.nt.model.*, java.util.*"%>

<%-- ${s} --%>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<table
			class="table table-bordered table-center text-denger bg-success">

			<%
			// out.println("<br>========Here we are print toString Method ======<br>");
			// out.println(request.getAttribute("s") + "<br>");

			// 				out.println("==================================================<br>");
			ArrayList<Model> ll = (ArrayList<Model>) request.getAttribute("s");
			if (ll.isEmpty()) {
				out.println(
				" <h1 style='color:red; text-align: center;'>RECODERS ARE NOT FOUND....</h1>");
			} else {
				for (Model m : ll) {
			%><tr>
				<td>
					<%
					out.println(
							m.getNo() + " " + m.getName() + " " + m.getJob() + " " + m.getSal());
					}
					}
					%>
				</td>
			</tr>
		</table>
	</div>
	<br>
	<h1>Welcome to Our page You can Do</h1>
	<a href="index.jsp">home</a>