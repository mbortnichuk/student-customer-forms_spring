<%--
  Created by IntelliJ IDEA.
  User: mbortnic
  Date: 4/3/19
  Time: 1:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">

        First name: <form:input path="firstName" />
        <br><br>
        Last name: <form:input path="lastName" />
        <br><br>

        Country:
        <%--on submit spring will call student.setCountry()--%>
        <form:select path="country">
            <form:options items="${student.countryOptions}"/>
            <%--<form:option value="Brazil" label="Brazil"/>--%>
            <%--<form:option value="France" label="France"/>--%>
            <%--<form:option value="Germany" label="Germany"/>--%>
            <%--<form:option value="India" label="India"/>--%>
        </form:select>

        <br><br>
        Favourite Language:
        Java: <form:radiobutton path="favouritelanguage" value="Java"/>
        C#: <form:radiobutton path="favouritelanguage" value="C#"/>
        PHP: <form:radiobutton path="favouritelanguage" value="PHP"/>
        Ruby: <form:radiobutton path="favouritelanguage" value="Ruby"/>

        <br><br>
        Operating Systems:
        Linux <form:checkbox path="operatingSystems" value="Linux"/>
        Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
        MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>
        <br><br>

        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
