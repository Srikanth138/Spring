<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!-- by default form is post mode request -->

<h1 style="color: red;">Hello this is the first page</h1>

<frm:form modelAttribute="second">

	<a href="second">click</a>
	<%-- <frm:form> --%>
	<input type="submit" value="click" />
</frm:form>