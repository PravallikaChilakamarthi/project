<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<html>

<head>
<title>Add Employee</title>
</head>

<body>


<center>
<form:form method="post" action="/submitemp" modelAttribute="emp">

Enter Employee ID <form:input path="id"/><br><br>
Enter Employee Name <form:input path="empname"/><br><br>
Enter Employee Age <form:input path="age"/><br><br>
Enter Employee Location <form:input path="location"/><br><br>

<input type="submit" value="Add Employee"/>

</form:form>

</body>
</center>
</html>