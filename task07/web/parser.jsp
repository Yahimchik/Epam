<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<label>
    <form method="post" action="${pageContext.request.contextPath}/parser-servlet">
        <select name="parser">
            <option value="dom">DOMParser</option>
            <option value="sax">SAXParser</option>
            <option value="stax">StAXParser</option>
        </select>
        <input type="submit" value="send">
    </form>
</label>
</body>
</html>
