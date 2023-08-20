<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List of persons</title>
    </head>
    <body>
        <h1>List of persons</h1>
        <ul>
            <c:forEach var="person" items="${persons}">
                <li>${person.id}</li>
                <li>${person.name}</li>
                <li>${person.lastName}</li>
                <li>${person.email}</li>
                <li>${person.number}</li>
            </c:forEach>
        </ul>
        <br>
        <a href="/sga-jee-web">home</a>
    </body>
</html>