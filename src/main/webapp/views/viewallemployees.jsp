<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<table align=center border=1>
<tr>
<td>ID</td>
<td>NAME</td>
<td>AGE</td>
<td>LOCATION</td>
<td>ACTION</td>
</tr>
 <c:forEach var="emp" items="${empdata}">
<tr>
<td>${emp.id}</td>
<td>${emp.empname}</td>
<td>${emp.age}</td>
<td>${emp.location}</td>
<td><a href="/employee/delete/${emp.id}">delete</a></td>
</tr>
</c:forEach>
</table>

