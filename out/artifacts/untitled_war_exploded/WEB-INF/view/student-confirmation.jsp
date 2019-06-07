<%--
  Created by IntelliJ IDEA.
  User: mbortnic
  Date: 4/3/19
  Time: 2:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>--%>
<html>
<head>
    <title>Student Confirmation Form</title>
</head>
<body>
    The student is confirmed: ${student.firstName} ${student.lastName}
    <%-- calls student.getFirstname() and student.getLastName() --%>

    <br><br>
    Country: ${student.country}
    <%--calls student.getCountry()--%>

    <br><br>
    Favourite language: ${student.favouritelanguage}
    <%--calls student.getFavoutirelanguage()--%>

    <br><br>
    Operating Systems:
    <ul>
        <c:forEach var="temp" items="${student.operatingSystems}">
            <li> ${temp} </li>
        </c:forEach>
    </ul>

</body>
</html>
