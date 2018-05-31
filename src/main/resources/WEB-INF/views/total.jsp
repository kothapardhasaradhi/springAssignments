<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" action="/total" modelAttribute="marks">    
	<table>
		<tr>
			<td>Science Marks:</td>
			<td><form:input path="ScienceMarks"  /></td>
		<tr>
		<tr>
			<td>Maths Marks:</td>
			<td><form:input path="MathsMarks"  /></td>
		<tr>
		<tr>
			<td>English Marks:</td>
			<td><form:input path="EnglishMarks"  /></td>
		<tr>
		<tr>
			<td>Total Marks</td>
			<td>{}</td>
		</tr>
	</table>
	</form:form>
</body>
</html>