<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>First JSP App</title>
</head>
<body>
<table>
    <form method="post" action="${pageContext.request.contextPath}/file-servlet" enctype="multipart/form-data">
        <input type="file" name="file-name"/>
        <input type="submit" value="send">
    </form>
    <%
        String fileName = (String) request.getAttribute("fileName");
        request.setAttribute("fileName", fileName);
    %>
</table>
</body>
</html>