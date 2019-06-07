<%--
  Created by IntelliJ IDEA.
  User: mbortnic
  Date: 4/3/19
  Time: 11:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World - Input Form</title>
</head>
<body>
    <%--<form action="/processForm" method="GET">--%>
        <%--<input type="text" name="studentName" placeholder="What's your name?" />--%>
        <%--<input type="submit" />--%>
    <%--</form>--%>

    <%--<form action="/processFormVersionTwo" method="GET">--%>
        <%--<input type="text" name="studentName" placeholder="What's your name?" />--%>
        <%--<input type="submit" />--%>
    <%--</form>--%>

    <%--if you have a forward slash before your from of action it will be relative to the current  browser url, which is /hello --%>
    <form action="processFormVersionThree" method="GET">
        <input type="text" name="studentName" placeholder="What's your name?" />
        <input type="submit" />
    </form>
</body>
</html>
