<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
	<form:form commandName="Blog">
					
		Title:	<form:input path="title" />
		<form:errors path="*" cssStyle="red"></form:errors>
		<br>
			
		Description:<form:input path="description" />
		<form:errors path="*"></form:errors>
		<br>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>