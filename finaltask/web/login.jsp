<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="resources/style/login.css">
    <title>Title</title>
</head>
<body>
<form action="<c:url value="/login"/>" method="post">
    <label>
        <input type="email" name="email"/>
    </label>
    <p></p>
    <label>
        <input type="text" name="password"/>
    </label>
    <p></p>
    <label>
        <select name="role">
            <option>employee</option>
            <option>admin</option>
            <option>client</option>
        </select>
    </label>
    <input type="submit" value="submit"/>
</form>
</body>
</html>
